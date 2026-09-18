package io.aerodyne.enterprise.logistics;

import io.aerodyne.enterprise.AuditTrail;

public record LogisticsAuditEvent(LogisticsRecord record, AuditTrail trail) {
    public static LogisticsAuditEvent created(LogisticsRecord record, String actor) {
        return new LogisticsAuditEvent(record, AuditTrail.now("logistics", "created", actor));
    }
}
