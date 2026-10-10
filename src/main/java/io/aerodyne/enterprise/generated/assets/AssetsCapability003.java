package io.aerodyne.enterprise.generated.assets;

public final class AssetsCapability003 {
    public static final String MODULE = "assets";
    public static final String CODE = "ASSETS-003";
    public static final String AREA = "Asset lifecycle management";

    private AssetsCapability003() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 003";
    }

    public static boolean requiresAudit() {
        return true;
    }
}