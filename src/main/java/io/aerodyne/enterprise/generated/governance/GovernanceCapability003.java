package io.aerodyne.enterprise.generated.governance;

public final class GovernanceCapability003 {
    public static final String MODULE = "governance";
    public static final String CODE = "GOVERNANCE-003";
    public static final String AREA = "Executive governance";

    private GovernanceCapability003() {
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