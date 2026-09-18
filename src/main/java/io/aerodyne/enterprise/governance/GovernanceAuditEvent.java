package io.aerodyne.enterprise.governance;

import io.aerodyne.enterprise.AuditTrail;

public record GovernanceAuditEvent(GovernanceRecord record, AuditTrail trail) {
    public static GovernanceAuditEvent created(GovernanceRecord record, String actor) {
        return new GovernanceAuditEvent(record, AuditTrail.now("governance", "created", actor));
    }
}
