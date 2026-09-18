package io.aerodyne.enterprise.budget;

import io.aerodyne.enterprise.AuditTrail;

public record BudgetAuditEvent(BudgetRecord record, AuditTrail trail) {
    public static BudgetAuditEvent created(BudgetRecord record, String actor) {
        return new BudgetAuditEvent(record, AuditTrail.now("budget", "created", actor));
    }
}
