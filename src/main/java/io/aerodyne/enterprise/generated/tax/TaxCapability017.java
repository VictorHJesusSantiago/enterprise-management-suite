package io.aerodyne.enterprise.generated.tax;

public final class TaxCapability017 {
    public static final String MODULE = "tax";
    public static final String CODE = "TAX-017";
    public static final String AREA = "Tax compliance";

    private TaxCapability017() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 017";
    }

    public static boolean requiresAudit() {
        return false;
    }
}