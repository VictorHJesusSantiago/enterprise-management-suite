package io.aerodyne.enterprise.generated.logistics;

public final class LogisticsCapability002 {
    public static final String MODULE = "logistics";
    public static final String CODE = "LOGISTICS-002";
    public static final String AREA = "Logistics execution";

    private LogisticsCapability002() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 002";
    }

    public static boolean requiresAudit() {
        return false;
    }
}