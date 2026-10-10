package io.aerodyne.enterprise.generated.assets;

public final class AssetsCapability009 {
    public static final String MODULE = "assets";
    public static final String CODE = "ASSETS-009";
    public static final String AREA = "Asset lifecycle management";

    private AssetsCapability009() {
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