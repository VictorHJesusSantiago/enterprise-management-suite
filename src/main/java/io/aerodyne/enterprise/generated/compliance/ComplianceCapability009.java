package io.aerodyne.enterprise.generated.compliance;

public final class ComplianceCapability009 {
    public static final String MODULE = "compliance";
    public static final String CODE = "COMPLIANCE-009";
    public static final String AREA = "Compliance obligations";

    private ComplianceCapability009() {
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