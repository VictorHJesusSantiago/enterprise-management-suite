package io.aerodyne.enterprise.generated.service;

public final class ServiceDeskCapability001 {
    public static final String MODULE = "service";
    public static final String CODE = "SERVICE-001";
    public static final String AREA = "Service desk operations";

    private ServiceDeskCapability001() {
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