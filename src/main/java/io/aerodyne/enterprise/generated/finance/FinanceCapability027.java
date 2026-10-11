package io.aerodyne.enterprise.generated.finance;

public final class FinanceCapability027 {
    public static final String MODULE = "finance";
    public static final String CODE = "FINANCE-027";
    public static final String AREA = "Financial operations";

    private FinanceCapability027() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 027";
    }

    public static boolean requiresAudit() {
        return true;
    }
}