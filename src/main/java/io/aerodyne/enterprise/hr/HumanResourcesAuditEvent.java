package io.aerodyne.enterprise.hr;

import io.aerodyne.enterprise.AuditTrail;

public record HumanResourcesAuditEvent(HumanResourcesRecord record, AuditTrail trail) {
    public static HumanResourcesAuditEvent created(HumanResourcesRecord record, String actor) {
        return new HumanResourcesAuditEvent(record, AuditTrail.now("hr", "created", actor));
    }
}
