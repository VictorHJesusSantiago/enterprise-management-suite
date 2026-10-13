package io.aerodyne.enterprise.generated.sales;

public final class SalesCapability008 {
    public static final String MODULE = "sales";
    public static final String CODE = "SALES-008";
    public static final String AREA = "Sales operations";

    private SalesCapability008() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 008";
    }

    public static boolean requiresAudit() {
        return false;
    }
}