package io.aerodyne.enterprise.generated.hr;

public final class HumanResourcesCapability007 {
    public static final String MODULE = "hr";
    public static final String CODE = "HR-007";
    public static final String AREA = "People operations";

    private HumanResourcesCapability007() {
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