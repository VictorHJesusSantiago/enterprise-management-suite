package io.aerodyne.enterprise.generated.quality;

public final class QualityCapability009 {
    public static final String MODULE = "quality";
    public static final String CODE = "QUALITY-009";
    public static final String AREA = "Quality management";

    private QualityCapability009() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 009";
    }

    public static boolean requiresAudit() {
        return true;
    }
}