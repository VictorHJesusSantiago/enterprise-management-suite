package io.aerodyne.enterprise.generated.hr;

public final class HumanResourcesCapability010 {
    public static final String MODULE = "hr";
    public static final String CODE = "HR-010";
    public static final String AREA = "People operations";

    private HumanResourcesCapability010() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 010";
    }

    public static boolean requiresAudit() {
        return false;
    }
}