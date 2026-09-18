package io.aerodyne.enterprise.risk;

import io.aerodyne.enterprise.AuditTrail;

public record RiskAuditEvent(RiskRecord record, AuditTrail trail) {
    public static RiskAuditEvent created(RiskRecord record, String actor) {
        return new RiskAuditEvent(record, AuditTrail.now("risk", "created", actor));
    }
}
