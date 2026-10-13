package io.aerodyne.enterprise.generated.risk;

public final class RiskCapability002 {
    public static final String MODULE = "risk";
    public static final String CODE = "RISK-002";
    public static final String AREA = "Risk controls";

    private RiskCapability002() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 002";
    }

    public static boolean requiresAudit() {
        return false;
    }
}