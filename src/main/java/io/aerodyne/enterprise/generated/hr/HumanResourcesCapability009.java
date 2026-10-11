package io.aerodyne.enterprise.generated.hr;

public final class HumanResourcesCapability009 {
    public static final String MODULE = "hr";
    public static final String CODE = "HR-009";
    public static final String AREA = "People operations";

    private HumanResourcesCapability009() {
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