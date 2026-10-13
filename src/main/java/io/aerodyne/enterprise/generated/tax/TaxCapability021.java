package io.aerodyne.enterprise.generated.tax;

public final class TaxCapability021 {
    public static final String MODULE = "tax";
    public static final String CODE = "TAX-021";
    public static final String AREA = "Tax compliance";

    private TaxCapability021() {
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