package io.aerodyne.enterprise.generated.finance;

public final class FinanceCapability004 {
    public static final String MODULE = "finance";
    public static final String CODE = "FINANCE-004";
    public static final String AREA = "Financial operations";

    private FinanceCapability004() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 004";
    }

    public static boolean requiresAudit() {
        return false;
    }
}