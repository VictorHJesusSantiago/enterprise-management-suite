package io.aerodyne.enterprise.invoices;

import io.aerodyne.enterprise.AuditTrail;

public record InvoicesAuditEvent(InvoicesRecord record, AuditTrail trail) {
    public static InvoicesAuditEvent created(InvoicesRecord record, String actor) {
        return new InvoicesAuditEvent(record, AuditTrail.now("invoices", "created", actor));
    }
}
