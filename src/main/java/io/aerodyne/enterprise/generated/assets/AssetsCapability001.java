package io.aerodyne.enterprise.generated.assets;

public final class AssetsCapability001 {
    public static final String MODULE = "assets";
    public static final String CODE = "ASSETS-001";
    public static final String AREA = "Asset lifecycle management";

    private AssetsCapability001() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 001";
    }

    public static boolean requiresAudit() {
        return false;
    }
}