package io.aerodyne.enterprise.generated.compliance;

public final class ComplianceCapability005 {
    public static final String MODULE = "compliance";
    public static final String CODE = "COMPLIANCE-005";
    public static final String AREA = "Compliance obligations";

    private ComplianceCapability005() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 005";
    }

    public static boolean requiresAudit() {
        return false;
    }
}