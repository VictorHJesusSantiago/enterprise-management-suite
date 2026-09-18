package io.aerodyne.enterprise.contracts;

import java.math.BigDecimal;

public final class ContractsPolicy {
    public boolean requiresApproval(ContractsRecord record) {
        return record.amount().compareTo(new BigDecimal("10000")) >= 0 || record.priority() == io.aerodyne.enterprise.PriorityLevel.CRITICAL;
    }

    public boolean canClose(ContractsRecord record) {
        return record.status() == ContractsStatus.APPROVED || record.status() == ContractsStatus.POSTED;
    }
}
