package io.aerodyne.enterprise.generated.hr;

public final class HumanResourcesCapability020 {
    public static final String MODULE = "hr";
    public static final String CODE = "HR-020";
    public static final String AREA = "People operations";

    private HumanResourcesCapability020() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 020";
    }

    public static boolean requiresAudit() {
        return false;
    }
}