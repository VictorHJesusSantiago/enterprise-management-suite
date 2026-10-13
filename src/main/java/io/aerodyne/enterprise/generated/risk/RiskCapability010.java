package io.aerodyne.enterprise.generated.risk;

public final class RiskCapability010 {
    public static final String MODULE = "risk";
    public static final String CODE = "RISK-010";
    public static final String AREA = "Risk controls";

    private RiskCapability010() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 010";
    }

    public static boolean requiresAudit() {
        return false;
    }
}