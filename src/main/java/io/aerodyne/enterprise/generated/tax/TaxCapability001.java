package io.aerodyne.enterprise.generated.tax;

public final class TaxCapability001 {
    public static final String MODULE = "tax";
    public static final String CODE = "TAX-001";
    public static final String AREA = "Tax compliance";

    private TaxCapability001() {
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