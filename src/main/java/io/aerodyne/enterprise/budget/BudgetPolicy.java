package io.aerodyne.enterprise.budget;

import java.math.BigDecimal;

public final class BudgetPolicy {
    public boolean requiresApproval(BudgetRecord record) {
        return record.amount().compareTo(new BigDecimal("10000")) >= 0 || record.priority() == io.aerodyne.enterprise.PriorityLevel.CRITICAL;
    }

    public boolean canClose(BudgetRecord record) {
        return record.status() == BudgetStatus.APPROVED || record.status() == BudgetStatus.POSTED;
    }
}
