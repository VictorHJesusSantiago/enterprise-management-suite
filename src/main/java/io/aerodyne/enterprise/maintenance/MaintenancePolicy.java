package io.aerodyne.enterprise.maintenance;

import java.math.BigDecimal;

public final class MaintenancePolicy {
    public boolean requiresApproval(MaintenanceRecord record) {
        return record.amount().compareTo(new BigDecimal("10000")) >= 0 || record.priority() == io.aerodyne.enterprise.PriorityLevel.CRITICAL;
    }

    public boolean canClose(MaintenanceRecord record) {
        return record.status() == MaintenanceStatus.APPROVED || record.status() == MaintenanceStatus.POSTED;
    }
}
