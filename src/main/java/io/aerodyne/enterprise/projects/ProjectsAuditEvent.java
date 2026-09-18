package io.aerodyne.enterprise.projects;

import io.aerodyne.enterprise.AuditTrail;

public record ProjectsAuditEvent(ProjectsRecord record, AuditTrail trail) {
    public static ProjectsAuditEvent created(ProjectsRecord record, String actor) {
        return new ProjectsAuditEvent(record, AuditTrail.now("projects", "created", actor));
    }
}
