package io.aerodyne.enterprise.generated.legal;

public final class LegalCapability018 {
    public static final String MODULE = "legal";
    public static final String CODE = "LEGAL-018";
    public static final String AREA = "Legal case management";

    private LegalCapability018() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 018";
    }

    public static boolean requiresAudit() {
        return true;
    }
}