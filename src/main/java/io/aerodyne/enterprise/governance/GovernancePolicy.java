package io.aerodyne.enterprise.governance;

import java.math.BigDecimal;

public final class GovernancePolicy {
    public boolean requiresApproval(GovernanceRecord record) {
        return record.amount().compareTo(new BigDecimal("10000")) >= 0 || record.priority() == io.aerodyne.enterprise.PriorityLevel.CRITICAL;
    }

    public boolean canClose(GovernanceRecord record) {
        return record.status() == GovernanceStatus.APPROVED || record.status() == GovernanceStatus.POSTED;
    }
}
