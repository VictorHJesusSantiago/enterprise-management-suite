package io.aerodyne.enterprise.inventory;

import java.math.BigDecimal;

public final class InventoryPolicy {
    public boolean requiresApproval(InventoryRecord record) {
        return record.amount().compareTo(new BigDecimal("10000")) >= 0 || record.priority() == io.aerodyne.enterprise.PriorityLevel.CRITICAL;
    }

    public boolean canClose(InventoryRecord record) {
        return record.status() == InventoryStatus.APPROVED || record.status() == InventoryStatus.POSTED;
    }
}
