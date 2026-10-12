package io.aerodyne.enterprise.generated.logistics;

public final class LogisticsCapability005 {
    public static final String MODULE = "logistics";
    public static final String CODE = "LOGISTICS-005";
    public static final String AREA = "Logistics execution";

    private LogisticsCapability005() {
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