package io.aerodyne.enterprise.finance;

import java.math.BigDecimal;

public final class FinancePolicy {
    public boolean requiresApproval(FinanceRecord record) {
        return record.amount().compareTo(new BigDecimal("10000")) >= 0 || record.priority() == io.aerodyne.enterprise.PriorityLevel.CRITICAL;
    }

    public boolean canClose(FinanceRecord record) {
        return record.status() == FinanceStatus.APPROVED || record.status() == FinanceStatus.POSTED;
    }
}
