package io.aerodyne.enterprise.generated.legal;

public final class LegalCapability012 {
    public static final String MODULE = "legal";
    public static final String CODE = "LEGAL-012";
    public static final String AREA = "Legal case management";

    private LegalCapability012() {
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