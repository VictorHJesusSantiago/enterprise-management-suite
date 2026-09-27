package io.aerodyne.enterprise;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class EnterpriseModulesContractTest {
    @ParameterizedTest(name = "{0} service persists valid records")
    @MethodSource("modules")
    void servicePersistsValidRecords(ModuleSpec module) throws ReflectiveOperationException {
        Object repository = module.repositoryClass().getConstructor().newInstance();
        Object service = module.serviceClass().getConstructor(module.repositoryClass()).newInstance(repository);

        Object record = module.serviceClass()
                .getMethod("open", String.class, String.class, String.class, BigDecimal.class, LocalDate.class)
                .invoke(service, module.packageName() + "-1", "Operational request", "Back office",
                        new BigDecimal("1500.50"), LocalDate.of(2026, 9, 30));

        assertEquals(enumValue(module.statusClass(), "UNDER_REVIEW"), read(record, "status"));
        assertEquals(PriorityLevel.NORMAL, read(record, "priority"));
        assertEquals(1L, module.repositoryClass().getMethod("count").invoke(repository));

        @SuppressWarnings("unchecked")
        List<Object> records = (List<Object>) module.serviceClass().getMethod("list").invoke(service);
        assertEquals(List.of(record), records);
        assertThrows(UnsupportedOperationException.class, () -> records.add(record));
    }

    @ParameterizedTest(name = "{0} validator rejects blank title and owner")
    @MethodSource("modules")
    void validatorRejectsBlankBusinessFields(ModuleSpec module) throws ReflectiveOperationException {
        Object validator = module.validatorClass().getConstructor().newInstance();
        Object invalid = module.newRecord("invalid", " ", "", BigDecimal.TEN, LocalDate.now(), "DRAFT", PriorityLevel.NORMAL);

        @SuppressWarnings("unchecked")
        List<ValidationIssue> issues = (List<ValidationIssue>) module.validatorClass()
                .getMethod("validate", module.recordClass())
                .invoke(validator, invalid);

        assertEquals(List.of("title", "owner"), issues.stream().map(ValidationIssue::field).toList());

        InvocationTargetException failure = assertThrows(
                InvocationTargetException.class,
                () -> module.validatorClass().getMethod("requireValid", module.recordClass()).invoke(validator, invalid));
        assertInstanceOf(IllegalArgumentException.class, failure.getCause());
    }

    @ParameterizedTest(name = "{0} workflow follows approval lifecycle")
    @MethodSource("modules")
    void workflowFollowsApprovalLifecycle(ModuleSpec module) throws ReflectiveOperationException {
        Object workflow = module.workflowClass().getConstructor().newInstance();

        assertEquals(enumValue(module.statusClass(), "UNDER_REVIEW"), next(module, workflow, "DRAFT", false));
        assertEquals(enumValue(module.statusClass(), "UNDER_REVIEW"), next(module, workflow, "UNDER_REVIEW", false));
        assertEquals(enumValue(module.statusClass(), "APPROVED"), next(module, workflow, "UNDER_REVIEW", true));
        assertEquals(enumValue(module.statusClass(), "POSTED"), next(module, workflow, "APPROVED", true));
        assertEquals(enumValue(module.statusClass(), "CANCELLED"), next(module, workflow, "CANCELLED", true));
    }

    @ParameterizedTest(name = "{0} report totals count and amount")
    @MethodSource("modules")
    void reportTotalsCountAndAmount(ModuleSpec module) throws ReflectiveOperationException {
        Object first = module.newRecord("r-1", "First", "Owner", new BigDecimal("20.25"), LocalDate.now(), "POSTED",
                PriorityLevel.NORMAL);
        Object second = module.newRecord("r-2", "Second", "Owner", new BigDecimal("10.75"), LocalDate.now(), "POSTED",
                PriorityLevel.HIGH);

        Object report = module.reportClass().getMethod("from", List.class).invoke(null, List.of(first, second));

        assertEquals(2L, read(report, "totalRecords"));
        assertEquals(new BigDecimal("31.00"), read(report, "totalAmount"));
        assertFalse(((String) read(report, "description")).isBlank());
    }

    @ParameterizedTest(name = "{0} policy guards approval and closing")
    @MethodSource("modules")
    void policyGuardsApprovalAndClosing(ModuleSpec module) throws ReflectiveOperationException {
        Object policy = module.policyClass().getConstructor().newInstance();
        Object highValue = module.newRecord("p-1", "High value", "Owner", new BigDecimal("10000.00"), LocalDate.now(),
                "UNDER_REVIEW", PriorityLevel.NORMAL);
        Object critical = module.newRecord("p-2", "Critical", "Owner", BigDecimal.ONE, LocalDate.now(),
                "UNDER_REVIEW", PriorityLevel.CRITICAL);
        Object ordinary = module.newRecord("p-3", "Ordinary", "Owner", BigDecimal.ONE, LocalDate.now(),
                "UNDER_REVIEW", PriorityLevel.NORMAL);
        Object approved = module.newRecord("p-4", "Approved", "Owner", BigDecimal.ONE, LocalDate.now(),
                "APPROVED", PriorityLevel.NORMAL);
        Object posted = module.newRecord("p-5", "Posted", "Owner", BigDecimal.ONE, LocalDate.now(),
                "POSTED", PriorityLevel.NORMAL);

        assertTrue((Boolean) module.policyClass().getMethod("requiresApproval", module.recordClass()).invoke(policy, highValue));
        assertTrue((Boolean) module.policyClass().getMethod("requiresApproval", module.recordClass()).invoke(policy, critical));
        assertFalse((Boolean) module.policyClass().getMethod("requiresApproval", module.recordClass()).invoke(policy, ordinary));
        assertFalse((Boolean) module.policyClass().getMethod("canClose", module.recordClass()).invoke(policy, ordinary));
        assertTrue((Boolean) module.policyClass().getMethod("canClose", module.recordClass()).invoke(policy, approved));
        assertTrue((Boolean) module.policyClass().getMethod("canClose", module.recordClass()).invoke(policy, posted));
    }

    @ParameterizedTest(name = "{0} enums and audit event expose stable domain shape")
    @MethodSource("modules")
    void enumsAndAuditEventExposeStableDomainShape(ModuleSpec module) throws ReflectiveOperationException {
        assertEquals(List.of("ADMINISTRATIVE", "COMMERCIAL", "INDUSTRIAL", "FINANCIAL", "REGULATORY", "STRATEGIC"),
                enumNames(module.categoryClass()));
        assertEquals(List.of("DRAFT", "UNDER_REVIEW", "APPROVED", "POSTED", "CLOSED", "CANCELLED"),
                enumNames(module.statusClass()));

        Object record = module.newRecord("audit-1", "Audit target", "Owner", BigDecimal.ONE, LocalDate.now(),
                "POSTED", PriorityLevel.NORMAL);
        AuditTrail trail = AuditTrail.now(module.packageName(), "posted", "auditor");
        Object event = module.auditEventClass().getConstructor(module.recordClass(), AuditTrail.class).newInstance(record, trail);

        assertEquals(record, read(event, "record"));
        assertEquals(trail, read(event, "trail"));
    }

    private static Object next(ModuleSpec module, Object workflow, String status, boolean approved)
            throws ReflectiveOperationException {
        return module.workflowClass()
                .getMethod("next", module.statusClass(), boolean.class)
                .invoke(workflow, enumValue(module.statusClass(), status), approved);
    }

    private static Object read(Object target, String accessor) throws ReflectiveOperationException {
        return target.getClass().getMethod(accessor).invoke(target);
    }

    private static Object enumValue(Class<?> enumClass, String name) {
        @SuppressWarnings({ "unchecked", "rawtypes" })
        Object value = Enum.valueOf((Class<? extends Enum>) enumClass.asSubclass(Enum.class), name);
        return value;
    }

    private static List<String> enumNames(Class<?> enumClass) {
        return Stream.of(enumClass.getEnumConstants()).map(Object::toString).toList();
    }

    static Stream<ModuleSpec> modules() {
        return Stream.of(
                spec("analytics", "Analytics"),
                spec("assets", "Assets"),
                spec("budget", "Budget"),
                spec("compliance", "Compliance"),
                spec("contracts", "Contracts"),
                spec("finance", "Finance"),
                spec("governance", "Governance"),
                spec("hr", "HumanResources"),
                spec("inventory", "Inventory"),
                spec("invoices", "Invoices"),
                spec("legal", "Legal"),
                spec("logistics", "Logistics"),
                spec("maintenance", "Maintenance"),
                spec("manufacturing", "Manufacturing"),
                spec("payroll", "Payroll"),
                spec("procurement", "Procurement"),
                spec("projects", "Projects"),
                spec("quality", "Quality"),
                spec("risk", "Risk"),
                spec("sales", "Sales"),
                spec("service", "ServiceDesk"),
                spec("tax", "Tax"));
    }

    private static ModuleSpec spec(String packageName, String typePrefix) {
        return new ModuleSpec(packageName, typePrefix);
    }

    record ModuleSpec(String packageName, String typePrefix) {
        Class<?> recordClass() throws ClassNotFoundException {
            return type("Record");
        }

        Class<?> repositoryClass() throws ClassNotFoundException {
            return type("Repository");
        }

        Class<?> serviceClass() throws ClassNotFoundException {
            return type("Service");
        }

        Class<?> validatorClass() throws ClassNotFoundException {
            return type("Validator");
        }

        Class<?> workflowClass() throws ClassNotFoundException {
            return type("Workflow");
        }

        Class<?> reportClass() throws ClassNotFoundException {
            return type("Report");
        }

        Class<?> policyClass() throws ClassNotFoundException {
            return type("Policy");
        }

        Class<?> categoryClass() throws ClassNotFoundException {
            return type("Category");
        }

        Class<?> statusClass() throws ClassNotFoundException {
            return type("Status");
        }

        Class<?> auditEventClass() throws ClassNotFoundException {
            return type("AuditEvent");
        }

        Object newRecord(String id, String title, String owner, BigDecimal amount, LocalDate dueDate, String status,
                PriorityLevel priority) throws ReflectiveOperationException {
            return recordClass()
                    .getConstructor(String.class, String.class, String.class, BigDecimal.class, LocalDate.class,
                            statusClass(), PriorityLevel.class)
                    .newInstance(id, title, owner, amount, dueDate, enumValue(statusClass(), status), priority);
        }

        private Class<?> type(String suffix) throws ClassNotFoundException {
            return Class.forName("io.aerodyne.enterprise." + packageName + "." + typePrefix + suffix);
        }

        @Override
        public String toString() {
            return typePrefix;
        }
    }
}
