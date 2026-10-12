package io.aerodyne.enterprise.generated.manufacturing;

public final class ManufacturingCapability009 {
    public static final String MODULE = "manufacturing";
    public static final String CODE = "MANUFACTURING-009";
    public static final String AREA = "Manufacturing execution";

    private ManufacturingCapability009() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 009";
    }

    public static boolean requiresAudit() {
        return true;
    }
}