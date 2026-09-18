package io.aerodyne.enterprise.payroll;

import io.aerodyne.enterprise.AuditTrail;

public record PayrollAuditEvent(PayrollRecord record, AuditTrail trail) {
    public static PayrollAuditEvent created(PayrollRecord record, String actor) {
        return new PayrollAuditEvent(record, AuditTrail.now("payroll", "created", actor));
    }
}
