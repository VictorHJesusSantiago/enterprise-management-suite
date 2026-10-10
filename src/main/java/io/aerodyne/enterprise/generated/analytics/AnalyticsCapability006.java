package io.aerodyne.enterprise.generated.analytics;

public final class AnalyticsCapability006 {
    public static final String MODULE = "analytics";
    public static final String CODE = "ANALYTICS-006";
    public static final String AREA = "Enterprise analytics and insights";

    private AnalyticsCapability006() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 006";
    }

    public static boolean requiresAudit() {
        return true;
    }
}