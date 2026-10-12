package io.aerodyne.enterprise.generated.payroll;

public final class PayrollCapability006 {
    public static final String MODULE = "payroll";
    public static final String CODE = "PAYROLL-006";
    public static final String AREA = "Payroll processing";

    private PayrollCapability006() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 006";
    }

    public static boolean requiresAudit() {
        return true;
    }
}