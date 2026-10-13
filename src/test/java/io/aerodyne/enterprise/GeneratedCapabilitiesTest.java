package io.aerodyne.enterprise;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Method;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class GeneratedCapabilitiesTest {
    private static final int CAPABILITIES_PER_MODULE = 40;

    @ParameterizedTest(name = "{0} generated capabilities expose stable metadata")
    @MethodSource("modules")
    void generatedCapabilitiesExposeStableMetadata(ModuleSpec module) throws ReflectiveOperationException {
        for (int index = 1; index <= CAPABILITIES_PER_MODULE; index++) {
            String number = "%03d".formatted(index);
            Class<?> capability = Class.forName("io.aerodyne.enterprise.generated."
                    + module.packageName() + "." + module.typePrefix() + "Capability" + number);

            assertEquals(module.packageName(), invoke(capability, "module"));
            assertEquals(module.packageName().toUpperCase() + "-" + number, invoke(capability, "code"));
            assertTrue(((String) invoke(capability, "label")).contains("capability " + number));
            assertEquals(index % 3 == 0, invoke(capability, "requiresAudit"));
        }
    }

    @ParameterizedTest(name = "{0} generated capability count is complete")
    @MethodSource("modules")
    void generatedCapabilityCountIsComplete(ModuleSpec module) throws ReflectiveOperationException {
        int found = 0;
        for (int index = 1; index <= CAPABILITIES_PER_MODULE; index++) {
            String number = "%03d".formatted(index);
            Class.forName("io.aerodyne.enterprise.generated."
                    + module.packageName() + "." + module.typePrefix() + "Capability" + number);
            found++;
        }

        assertEquals(CAPABILITIES_PER_MODULE, found);
        assertFalse(module.packageName().isBlank());
        assertFalse(module.typePrefix().isBlank());
    }

    private static Object invoke(Class<?> type, String methodName) throws ReflectiveOperationException {
        Method method = type.getMethod(methodName);
        return method.invoke(null);
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
        @Override
        public String toString() {
            return typePrefix;
        }
    }
}
