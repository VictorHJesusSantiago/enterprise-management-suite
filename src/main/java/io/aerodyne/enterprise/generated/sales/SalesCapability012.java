package io.aerodyne.enterprise.generated.sales;

public final class SalesCapability012 {
    public static final String MODULE = "sales";
    public static final String CODE = "SALES-012";
    public static final String AREA = "Sales operations";

    private SalesCapability012() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 012";
    }

    public static boolean requiresAudit() {
        return true;
    }
}