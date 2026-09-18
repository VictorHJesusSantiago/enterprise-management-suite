package io.aerodyne.enterprise.service;

import io.aerodyne.enterprise.AuditTrail;

public record ServiceDeskAuditEvent(ServiceDeskRecord record, AuditTrail trail) {
    public static ServiceDeskAuditEvent created(ServiceDeskRecord record, String actor) {
        return new ServiceDeskAuditEvent(record, AuditTrail.now("service", "created", actor));
    }
}
