package io.aerodyne.enterprise.generated.compliance;

public final class ComplianceCapability019 {
    public static final String MODULE = "compliance";
    public static final String CODE = "COMPLIANCE-019";
    public static final String AREA = "Compliance obligations";

    private ComplianceCapability019() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 019";
    }

    public static boolean requiresAudit() {
        return false;
    }
}