package io.aerodyne.enterprise.generated.payroll;

public final class PayrollCapability025 {
    public static final String MODULE = "payroll";
    public static final String CODE = "PAYROLL-025";
    public static final String AREA = "Payroll processing";

    private PayrollCapability025() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 025";
    }

    public static boolean requiresAudit() {
        return false;
    }
}