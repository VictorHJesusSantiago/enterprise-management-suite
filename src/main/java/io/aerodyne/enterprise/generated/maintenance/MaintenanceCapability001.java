package io.aerodyne.enterprise.generated.maintenance;

public final class MaintenanceCapability001 {
    public static final String MODULE = "maintenance";
    public static final String CODE = "MAINTENANCE-001";
    public static final String AREA = "Maintenance operations";

    private MaintenanceCapability001() {
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