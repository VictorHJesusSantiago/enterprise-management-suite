package io.aerodyne.enterprise.generated.service;

public final class ServiceDeskCapability021 {
    public static final String MODULE = "service";
    public static final String CODE = "SERVICE-021";
    public static final String AREA = "Service desk operations";

    private ServiceDeskCapability021() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 021";
    }

    public static boolean requiresAudit() {
        return true;
    }
}