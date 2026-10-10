package io.aerodyne.enterprise.generated.analytics;

public final class AnalyticsCapability003 {
    public static final String MODULE = "analytics";
    public static final String CODE = "ANALYTICS-003";
    public static final String AREA = "Enterprise analytics and insights";

    private AnalyticsCapability003() {
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