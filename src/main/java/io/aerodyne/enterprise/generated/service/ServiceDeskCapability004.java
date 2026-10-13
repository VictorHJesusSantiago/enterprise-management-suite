package io.aerodyne.enterprise.generated.service;

public final class ServiceDeskCapability004 {
    public static final String MODULE = "service";
    public static final String CODE = "SERVICE-004";
    public static final String AREA = "Service desk operations";

    private ServiceDeskCapability004() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 004";
    }

    public static boolean requiresAudit() {
        return false;
    }
}