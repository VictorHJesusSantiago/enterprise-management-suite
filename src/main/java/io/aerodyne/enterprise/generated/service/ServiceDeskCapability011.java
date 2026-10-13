package io.aerodyne.enterprise.generated.service;

public final class ServiceDeskCapability011 {
    public static final String MODULE = "service";
    public static final String CODE = "SERVICE-011";
    public static final String AREA = "Service desk operations";

    private ServiceDeskCapability011() {
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