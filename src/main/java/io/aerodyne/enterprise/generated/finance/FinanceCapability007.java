package io.aerodyne.enterprise.generated.finance;

public final class FinanceCapability007 {
    public static final String MODULE = "finance";
    public static final String CODE = "FINANCE-007";
    public static final String AREA = "Financial operations";

    private FinanceCapability007() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 007";
    }

    public static boolean requiresAudit() {
        return false;
    }
}