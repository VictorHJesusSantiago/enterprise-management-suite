package io.aerodyne.enterprise.generated.quality;

public final class QualityCapability005 {
    public static final String MODULE = "quality";
    public static final String CODE = "QUALITY-005";
    public static final String AREA = "Quality management";

    private QualityCapability005() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 005";
    }

    public static boolean requiresAudit() {
        return false;
    }
}