package io.aerodyne.enterprise.generated.procurement;

public final class ProcurementCapability003 {
    public static final String MODULE = "procurement";
    public static final String CODE = "PROCUREMENT-003";
    public static final String AREA = "Procurement sourcing";

    private ProcurementCapability003() {
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