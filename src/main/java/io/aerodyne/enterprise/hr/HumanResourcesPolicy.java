package io.aerodyne.enterprise.hr;

import java.math.BigDecimal;

public final class HumanResourcesPolicy {
    public boolean requiresApproval(HumanResourcesRecord record) {
        return record.amount().compareTo(new BigDecimal("10000")) >= 0 || record.priority() == io.aerodyne.enterprise.PriorityLevel.CRITICAL;
    }

    public boolean canClose(HumanResourcesRecord record) {
        return record.status() == HumanResourcesStatus.APPROVED || record.status() == HumanResourcesStatus.POSTED;
    }
}
