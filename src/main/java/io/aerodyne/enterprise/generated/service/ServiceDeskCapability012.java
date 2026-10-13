package io.aerodyne.enterprise.generated.service;

public final class ServiceDeskCapability012 {
    public static final String MODULE = "service";
    public static final String CODE = "SERVICE-012";
    public static final String AREA = "Service desk operations";

    private ServiceDeskCapability012() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 012";
    }

    public static boolean requiresAudit() {
        return true;
    }
}