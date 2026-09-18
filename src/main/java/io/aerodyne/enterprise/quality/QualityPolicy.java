package io.aerodyne.enterprise.quality;

import java.math.BigDecimal;

public final class QualityPolicy {
    public boolean requiresApproval(QualityRecord record) {
        return record.amount().compareTo(new BigDecimal("10000")) >= 0 || record.priority() == io.aerodyne.enterprise.PriorityLevel.CRITICAL;
    }

    public boolean canClose(QualityRecord record) {
        return record.status() == QualityStatus.APPROVED || record.status() == QualityStatus.POSTED;
    }
}
