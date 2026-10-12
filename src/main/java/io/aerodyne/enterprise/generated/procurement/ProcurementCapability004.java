package io.aerodyne.enterprise.generated.procurement;

public final class ProcurementCapability004 {
    public static final String MODULE = "procurement";
    public static final String CODE = "PROCUREMENT-004";
    public static final String AREA = "Procurement sourcing";

    private ProcurementCapability004() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 004";
    }

    public static boolean requiresAudit() {
        return false;
    }
}