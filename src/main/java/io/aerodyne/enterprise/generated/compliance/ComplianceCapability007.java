package io.aerodyne.enterprise.generated.compliance;

public final class ComplianceCapability007 {
    public static final String MODULE = "compliance";
    public static final String CODE = "COMPLIANCE-007";
    public static final String AREA = "Compliance obligations";

    private ComplianceCapability007() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 007";
    }

    public static boolean requiresAudit() {
        return false;
    }
}