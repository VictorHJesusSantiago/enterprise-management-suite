package io.aerodyne.enterprise.generated.legal;

public final class LegalCapability013 {
    public static final String MODULE = "legal";
    public static final String CODE = "LEGAL-013";
    public static final String AREA = "Legal case management";

    private LegalCapability013() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 013";
    }

    public static boolean requiresAudit() {
        return false;
    }
}