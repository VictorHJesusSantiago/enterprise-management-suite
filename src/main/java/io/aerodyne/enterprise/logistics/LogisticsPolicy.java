package io.aerodyne.enterprise.logistics;

import java.math.BigDecimal;

public final class LogisticsPolicy {
    public boolean requiresApproval(LogisticsRecord record) {
        return record.amount().compareTo(new BigDecimal("10000")) >= 0 || record.priority() == io.aerodyne.enterprise.PriorityLevel.CRITICAL;
    }

    public boolean canClose(LogisticsRecord record) {
        return record.status() == LogisticsStatus.APPROVED || record.status() == LogisticsStatus.POSTED;
    }
}
