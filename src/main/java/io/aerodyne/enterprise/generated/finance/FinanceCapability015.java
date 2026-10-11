package io.aerodyne.enterprise.generated.finance;

public final class FinanceCapability015 {
    public static final String MODULE = "finance";
    public static final String CODE = "FINANCE-015";
    public static final String AREA = "Financial operations";

    private FinanceCapability015() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 015";
    }

    public static boolean requiresAudit() {
        return true;
    }
}