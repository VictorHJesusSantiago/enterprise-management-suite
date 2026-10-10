package io.aerodyne.enterprise.generated.finance;

public final class FinanceCapability001 {
    public static final String MODULE = "finance";
    public static final String CODE = "FINANCE-001";
    public static final String AREA = "Financial operations";

    private FinanceCapability001() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 001";
    }

    public static boolean requiresAudit() {
        return false;
    }
}