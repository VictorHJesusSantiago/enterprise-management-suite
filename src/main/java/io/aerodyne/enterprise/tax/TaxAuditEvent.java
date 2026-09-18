package io.aerodyne.enterprise.tax;

import io.aerodyne.enterprise.AuditTrail;

public record TaxAuditEvent(TaxRecord record, AuditTrail trail) {
    public static TaxAuditEvent created(TaxRecord record, String actor) {
        return new TaxAuditEvent(record, AuditTrail.now("tax", "created", actor));
    }
}
