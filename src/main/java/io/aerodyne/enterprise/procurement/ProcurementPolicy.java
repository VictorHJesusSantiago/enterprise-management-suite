package io.aerodyne.enterprise.procurement;

import java.math.BigDecimal;

public final class ProcurementPolicy {
    public boolean requiresApproval(ProcurementRecord record) {
        return record.amount().compareTo(new BigDecimal("10000")) >= 0 || record.priority() == io.aerodyne.enterprise.PriorityLevel.CRITICAL;
    }

    public boolean canClose(ProcurementRecord record) {
        return record.status() == ProcurementStatus.APPROVED || record.status() == ProcurementStatus.POSTED;
    }
}
