package io.aerodyne.enterprise.generated.sales;

public final class SalesCapability001 {
    public static final String MODULE = "sales";
    public static final String CODE = "SALES-001";
    public static final String AREA = "Sales operations";

    private SalesCapability001() {
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