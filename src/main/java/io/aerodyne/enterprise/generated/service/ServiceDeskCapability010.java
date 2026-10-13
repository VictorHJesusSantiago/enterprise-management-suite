package io.aerodyne.enterprise.generated.service;

public final class ServiceDeskCapability010 {
    public static final String MODULE = "service";
    public static final String CODE = "SERVICE-010";
    public static final String AREA = "Service desk operations";

    private ServiceDeskCapability010() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 010";
    }

    public static boolean requiresAudit() {
        return false;
    }
}