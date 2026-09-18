package io.aerodyne.enterprise.projects;

import java.math.BigDecimal;

public final class ProjectsPolicy {
    public boolean requiresApproval(ProjectsRecord record) {
        return record.amount().compareTo(new BigDecimal("10000")) >= 0 || record.priority() == io.aerodyne.enterprise.PriorityLevel.CRITICAL;
    }

    public boolean canClose(ProjectsRecord record) {
        return record.status() == ProjectsStatus.APPROVED || record.status() == ProjectsStatus.POSTED;
    }
}
