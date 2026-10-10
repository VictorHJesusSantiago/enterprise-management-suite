package io.aerodyne.enterprise.generated.compliance;

public final class ComplianceCapability021 {
    public static final String MODULE = "compliance";
    public static final String CODE = "COMPLIANCE-021";
    public static final String AREA = "Compliance obligations";

    private ComplianceCapability021() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 021";
    }

    public static boolean requiresAudit() {
        return true;
    }
}