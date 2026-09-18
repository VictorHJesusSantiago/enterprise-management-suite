package io.aerodyne.enterprise.sales;

import io.aerodyne.enterprise.AuditTrail;

public record SalesAuditEvent(SalesRecord record, AuditTrail trail) {
    public static SalesAuditEvent created(SalesRecord record, String actor) {
        return new SalesAuditEvent(record, AuditTrail.now("sales", "created", actor));
    }
}
