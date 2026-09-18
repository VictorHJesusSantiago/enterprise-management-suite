package io.aerodyne.enterprise.legal;

import io.aerodyne.enterprise.AuditTrail;

public record LegalAuditEvent(LegalRecord record, AuditTrail trail) {
    public static LegalAuditEvent created(LegalRecord record, String actor) {
        return new LegalAuditEvent(record, AuditTrail.now("legal", "created", actor));
    }
}
