package io.aerodyne.enterprise.generated.sales;

public final class SalesCapability021 {
    public static final String MODULE = "sales";
    public static final String CODE = "SALES-021";
    public static final String AREA = "Sales operations";

    private SalesCapability021() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 021";
    }

    public static boolean requiresAudit() {
        return true;
    }
}