package io.aerodyne.enterprise.assets;

import io.aerodyne.enterprise.AuditTrail;

public record AssetsAuditEvent(AssetsRecord record, AuditTrail trail) {
    public static AssetsAuditEvent created(AssetsRecord record, String actor) {
        return new AssetsAuditEvent(record, AuditTrail.now("assets", "created", actor));
    }
}
