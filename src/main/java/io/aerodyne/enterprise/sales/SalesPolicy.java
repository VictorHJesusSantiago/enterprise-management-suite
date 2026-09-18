package io.aerodyne.enterprise.sales;

import java.math.BigDecimal;

public final class SalesPolicy {
    public boolean requiresApproval(SalesRecord record) {
        return record.amount().compareTo(new BigDecimal("10000")) >= 0 || record.priority() == io.aerodyne.enterprise.PriorityLevel.CRITICAL;
    }

    public boolean canClose(SalesRecord record) {
        return record.status() == SalesStatus.APPROVED || record.status() == SalesStatus.POSTED;
    }
}
