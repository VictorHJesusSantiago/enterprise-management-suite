package io.aerodyne.enterprise.generated.payroll;

public final class PayrollCapability009 {
    public static final String MODULE = "payroll";
    public static final String CODE = "PAYROLL-009";
    public static final String AREA = "Payroll processing";

    private PayrollCapability009() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 009";
    }

    public static boolean requiresAudit() {
        return true;
    }
}