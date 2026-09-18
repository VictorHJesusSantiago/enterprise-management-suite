package io.aerodyne.enterprise.analytics;

import java.math.BigDecimal;

public final class AnalyticsPolicy {
    public boolean requiresApproval(AnalyticsRecord record) {
        return record.amount().compareTo(new BigDecimal("10000")) >= 0 || record.priority() == io.aerodyne.enterprise.PriorityLevel.CRITICAL;
    }

    public boolean canClose(AnalyticsRecord record) {
        return record.status() == AnalyticsStatus.APPROVED || record.status() == AnalyticsStatus.POSTED;
    }
}
