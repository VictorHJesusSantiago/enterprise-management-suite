package io.aerodyne.enterprise.generated.finance;

public final class FinanceCapability010 {
    public static final String MODULE = "finance";
    public static final String CODE = "FINANCE-010";
    public static final String AREA = "Financial operations";

    private FinanceCapability010() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 010";
    }

    public static boolean requiresAudit() {
        return false;
    }
}