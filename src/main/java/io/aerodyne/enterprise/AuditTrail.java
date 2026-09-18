package io.aerodyne.enterprise;

import java.time.Instant;

public record AuditTrail(String module, String action, String actor, Instant happenedAt) {
    public static AuditTrail now(String module, String action, String actor) {
        return new AuditTrail(module, action, actor, Instant.now());
    }
}
