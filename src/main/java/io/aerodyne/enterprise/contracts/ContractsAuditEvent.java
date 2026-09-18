package io.aerodyne.enterprise.contracts;

import io.aerodyne.enterprise.AuditTrail;

public record ContractsAuditEvent(ContractsRecord record, AuditTrail trail) {
    public static ContractsAuditEvent created(ContractsRecord record, String actor) {
        return new ContractsAuditEvent(record, AuditTrail.now("contracts", "created", actor));
    }
}
