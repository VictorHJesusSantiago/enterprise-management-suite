package io.aerodyne.enterprise.compliance;

import io.aerodyne.enterprise.AuditTrail;

public record ComplianceAuditEvent(ComplianceRecord record, AuditTrail trail) {
    public static ComplianceAuditEvent created(ComplianceRecord record, String actor) {
        return new ComplianceAuditEvent(record, AuditTrail.now("compliance", "created", actor));
    }
}
