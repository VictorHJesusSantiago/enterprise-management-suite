package io.aerodyne.enterprise.manufacturing;

import java.math.BigDecimal;

public final class ManufacturingPolicy {
    public boolean requiresApproval(ManufacturingRecord record) {
        return record.amount().compareTo(new BigDecimal("10000")) >= 0 || record.priority() == io.aerodyne.enterprise.PriorityLevel.CRITICAL;
    }

    public boolean canClose(ManufacturingRecord record) {
        return record.status() == ManufacturingStatus.APPROVED || record.status() == ManufacturingStatus.POSTED;
    }
}
