package io.aerodyne.enterprise.generated.inventory;

public final class InventoryCapability022 {
    public static final String MODULE = "inventory";
    public static final String CODE = "INVENTORY-022";
    public static final String AREA = "Inventory control";

    private InventoryCapability022() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 022";
    }

    public static boolean requiresAudit() {
        return false;
    }
}