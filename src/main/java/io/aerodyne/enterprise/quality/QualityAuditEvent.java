package io.aerodyne.enterprise.quality;

import io.aerodyne.enterprise.AuditTrail;

public record QualityAuditEvent(QualityRecord record, AuditTrail trail) {
    public static QualityAuditEvent created(QualityRecord record, String actor) {
        return new QualityAuditEvent(record, AuditTrail.now("quality", "created", actor));
    }
}
