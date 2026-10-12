package io.aerodyne.enterprise.generated.procurement;

public final class ProcurementCapability009 {
    public static final String MODULE = "procurement";
    public static final String CODE = "PROCUREMENT-009";
    public static final String AREA = "Procurement sourcing";

    private ProcurementCapability009() {
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