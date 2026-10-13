package io.aerodyne.enterprise.generated.quality;

public final class QualityCapability003 {
    public static final String MODULE = "quality";
    public static final String CODE = "QUALITY-003";
    public static final String AREA = "Quality management";

    private QualityCapability003() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 003";
    }

    public static boolean requiresAudit() {
        return true;
    }
}