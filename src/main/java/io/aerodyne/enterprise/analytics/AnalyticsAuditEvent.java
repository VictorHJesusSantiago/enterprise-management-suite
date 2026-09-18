package io.aerodyne.enterprise.analytics;

import io.aerodyne.enterprise.AuditTrail;

public record AnalyticsAuditEvent(AnalyticsRecord record, AuditTrail trail) {
    public static AnalyticsAuditEvent created(AnalyticsRecord record, String actor) {
        return new AnalyticsAuditEvent(record, AuditTrail.now("analytics", "created", actor));
    }
}
