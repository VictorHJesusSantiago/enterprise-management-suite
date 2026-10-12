package io.aerodyne.enterprise.generated.maintenance;

public final class MaintenanceCapability010 {
    public static final String MODULE = "maintenance";
    public static final String CODE = "MAINTENANCE-010";
    public static final String AREA = "Maintenance operations";

    private MaintenanceCapability010() {
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