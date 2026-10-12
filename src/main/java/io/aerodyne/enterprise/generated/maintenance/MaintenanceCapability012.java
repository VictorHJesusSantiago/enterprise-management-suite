package io.aerodyne.enterprise.generated.maintenance;

public final class MaintenanceCapability012 {
    public static final String MODULE = "maintenance";
    public static final String CODE = "MAINTENANCE-012";
    public static final String AREA = "Maintenance operations";

    private MaintenanceCapability012() {
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