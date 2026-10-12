package io.aerodyne.enterprise.generated.logistics;

public final class LogisticsCapability011 {
    public static final String MODULE = "logistics";
    public static final String CODE = "LOGISTICS-011";
    public static final String AREA = "Logistics execution";

    private LogisticsCapability011() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 011";
    }

    public static boolean requiresAudit() {
        return false;
    }
}