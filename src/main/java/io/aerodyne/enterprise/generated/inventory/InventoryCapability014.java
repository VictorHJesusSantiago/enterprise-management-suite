package io.aerodyne.enterprise.generated.inventory;

public final class InventoryCapability014 {
    public static final String MODULE = "inventory";
    public static final String CODE = "INVENTORY-014";
    public static final String AREA = "Inventory control";

    private InventoryCapability014() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 014";
    }

    public static boolean requiresAudit() {
        return false;
    }
}