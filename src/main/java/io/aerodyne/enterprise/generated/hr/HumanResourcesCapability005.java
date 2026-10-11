package io.aerodyne.enterprise.generated.hr;

public final class HumanResourcesCapability005 {
    public static final String MODULE = "hr";
    public static final String CODE = "HR-005";
    public static final String AREA = "People operations";

    private HumanResourcesCapability005() {
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