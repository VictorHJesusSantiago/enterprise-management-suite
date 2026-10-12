package io.aerodyne.enterprise.generated.maintenance;

public final class MaintenanceCapability003 {
    public static final String MODULE = "maintenance";
    public static final String CODE = "MAINTENANCE-003";
    public static final String AREA = "Maintenance operations";

    private MaintenanceCapability003() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 003";
    }

    public static boolean requiresAudit() {
        return true;
    }
}