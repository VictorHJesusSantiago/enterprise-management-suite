package io.aerodyne.enterprise.generated.manufacturing;

public final class ManufacturingCapability015 {
    public static final String MODULE = "manufacturing";
    public static final String CODE = "MANUFACTURING-015";
    public static final String AREA = "Manufacturing execution";

    private ManufacturingCapability015() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 015";
    }

    public static boolean requiresAudit() {
        return true;
    }
}