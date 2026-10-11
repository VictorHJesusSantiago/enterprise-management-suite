package io.aerodyne.enterprise.generated.hr;

public final class HumanResourcesCapability012 {
    public static final String MODULE = "hr";
    public static final String CODE = "HR-012";
    public static final String AREA = "People operations";

    private HumanResourcesCapability012() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 012";
    }

    public static boolean requiresAudit() {
        return true;
    }
}