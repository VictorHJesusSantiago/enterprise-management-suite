package io.aerodyne.enterprise.manufacturing;

import io.aerodyne.enterprise.AuditTrail;

public record ManufacturingAuditEvent(ManufacturingRecord record, AuditTrail trail) {
    public static ManufacturingAuditEvent created(ManufacturingRecord record, String actor) {
        return new ManufacturingAuditEvent(record, AuditTrail.now("manufacturing", "created", actor));
    }
}
