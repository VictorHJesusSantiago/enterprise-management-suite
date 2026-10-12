package io.aerodyne.enterprise.generated.payroll;

public final class PayrollCapability020 {
    public static final String MODULE = "payroll";
    public static final String CODE = "PAYROLL-020";
    public static final String AREA = "Payroll processing";

    private PayrollCapability020() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 020";
    }

    public static boolean requiresAudit() {
        return false;
    }
}