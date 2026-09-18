package io.aerodyne.enterprise.inventory;

public final class InventoryWorkflow {
    public InventoryStatus next(InventoryStatus current, boolean approved) {
        if (current == InventoryStatus.DRAFT) {
            return InventoryStatus.UNDER_REVIEW;
        }
        if (current == InventoryStatus.UNDER_REVIEW && approved) {
            return InventoryStatus.APPROVED;
        }
        if (current == InventoryStatus.APPROVED) {
            return InventoryStatus.POSTED;
        }
        return current;
    }
}
