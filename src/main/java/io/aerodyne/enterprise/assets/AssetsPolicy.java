package io.aerodyne.enterprise.assets;

import java.math.BigDecimal;

public final class AssetsPolicy {
    public boolean requiresApproval(AssetsRecord record) {
        return record.amount().compareTo(new BigDecimal("10000")) >= 0 || record.priority() == io.aerodyne.enterprise.PriorityLevel.CRITICAL;
    }

    public boolean canClose(AssetsRecord record) {
        return record.status() == AssetsStatus.APPROVED || record.status() == AssetsStatus.POSTED;
    }
}
