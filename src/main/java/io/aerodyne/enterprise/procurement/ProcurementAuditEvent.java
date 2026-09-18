package io.aerodyne.enterprise.procurement;

import io.aerodyne.enterprise.AuditTrail;

public record ProcurementAuditEvent(ProcurementRecord record, AuditTrail trail) {
    public static ProcurementAuditEvent created(ProcurementRecord record, String actor) {
        return new ProcurementAuditEvent(record, AuditTrail.now("procurement", "created", actor));
    }
}
