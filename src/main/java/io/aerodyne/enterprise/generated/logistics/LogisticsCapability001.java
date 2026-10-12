package io.aerodyne.enterprise.generated.logistics;

public final class LogisticsCapability001 {
    public static final String MODULE = "logistics";
    public static final String CODE = "LOGISTICS-001";
    public static final String AREA = "Logistics execution";

    private LogisticsCapability001() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 001";
    }

    public static boolean requiresAudit() {
        return false;
    }
}