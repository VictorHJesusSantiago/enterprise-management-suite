package io.aerodyne.enterprise.generated.risk;

public final class RiskCapability009 {
    public static final String MODULE = "risk";
    public static final String CODE = "RISK-009";
    public static final String AREA = "Risk controls";

    private RiskCapability009() {
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