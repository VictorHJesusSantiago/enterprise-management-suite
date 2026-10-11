package io.aerodyne.enterprise.generated.governance;

public final class GovernanceCapability020 {
    public static final String MODULE = "governance";
    public static final String CODE = "GOVERNANCE-020";
    public static final String AREA = "Executive governance";

    private GovernanceCapability020() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 020";
    }

    public static boolean requiresAudit() {
        return false;
    }
}