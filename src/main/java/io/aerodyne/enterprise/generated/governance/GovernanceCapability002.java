package io.aerodyne.enterprise.generated.governance;

public final class GovernanceCapability002 {
    public static final String MODULE = "governance";
    public static final String CODE = "GOVERNANCE-002";
    public static final String AREA = "Executive governance";

    private GovernanceCapability002() {
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