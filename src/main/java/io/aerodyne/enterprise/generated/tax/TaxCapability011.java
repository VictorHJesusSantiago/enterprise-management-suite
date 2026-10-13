package io.aerodyne.enterprise.generated.tax;

public final class TaxCapability011 {
    public static final String MODULE = "tax";
    public static final String CODE = "TAX-011";
    public static final String AREA = "Tax compliance";

    private TaxCapability011() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 011";
    }

    public static boolean requiresAudit() {
        return false;
    }
}