package io.aerodyne.enterprise.maintenance;

import io.aerodyne.enterprise.AuditTrail;

public record MaintenanceAuditEvent(MaintenanceRecord record, AuditTrail trail) {
    public static MaintenanceAuditEvent created(MaintenanceRecord record, String actor) {
        return new MaintenanceAuditEvent(record, AuditTrail.now("maintenance", "created", actor));
    }
}
