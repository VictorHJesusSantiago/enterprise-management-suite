package io.aerodyne.enterprise.generated.legal;

public final class LegalCapability020 {
    public static final String MODULE = "legal";
    public static final String CODE = "LEGAL-020";
    public static final String AREA = "Legal case management";

    private LegalCapability020() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 020";
    }

    public static boolean requiresAudit() {
        return false;
    }
}