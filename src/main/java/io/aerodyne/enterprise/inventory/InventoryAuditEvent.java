package io.aerodyne.enterprise.inventory;

import io.aerodyne.enterprise.AuditTrail;

public record InventoryAuditEvent(InventoryRecord record, AuditTrail trail) {
    public static InventoryAuditEvent created(InventoryRecord record, String actor) {
        return new InventoryAuditEvent(record, AuditTrail.now("inventory", "created", actor));
    }
}
