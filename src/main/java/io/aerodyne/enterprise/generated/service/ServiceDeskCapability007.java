package io.aerodyne.enterprise.generated.service;

public final class ServiceDeskCapability007 {
    public static final String MODULE = "service";
    public static final String CODE = "SERVICE-007";
    public static final String AREA = "Service desk operations";

    private ServiceDeskCapability007() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 007";
    }

    public static boolean requiresAudit() {
        return false;
    }
}