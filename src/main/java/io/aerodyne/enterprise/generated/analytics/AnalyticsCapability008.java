package io.aerodyne.enterprise.generated.analytics;

public final class AnalyticsCapability008 {
    public static final String MODULE = "analytics";
    public static final String CODE = "ANALYTICS-008";
    public static final String AREA = "Enterprise analytics and insights";

    private AnalyticsCapability008() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 008";
    }

    public static boolean requiresAudit() {
        return false;
    }
}