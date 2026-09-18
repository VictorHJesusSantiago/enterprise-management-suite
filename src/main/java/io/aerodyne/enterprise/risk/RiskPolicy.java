package io.aerodyne.enterprise.risk;

import java.math.BigDecimal;

public final class RiskPolicy {
    public boolean requiresApproval(RiskRecord record) {
        return record.amount().compareTo(new BigDecimal("10000")) >= 0 || record.priority() == io.aerodyne.enterprise.PriorityLevel.CRITICAL;
    }

    public boolean canClose(RiskRecord record) {
        return record.status() == RiskStatus.APPROVED || record.status() == RiskStatus.POSTED;
    }
}
