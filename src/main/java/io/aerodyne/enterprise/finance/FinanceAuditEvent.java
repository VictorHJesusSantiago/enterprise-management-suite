package io.aerodyne.enterprise.finance;

import io.aerodyne.enterprise.AuditTrail;

public record FinanceAuditEvent(FinanceRecord record, AuditTrail trail) {
    public static FinanceAuditEvent created(FinanceRecord record, String actor) {
        return new FinanceAuditEvent(record, AuditTrail.now("finance", "created", actor));
    }
}
