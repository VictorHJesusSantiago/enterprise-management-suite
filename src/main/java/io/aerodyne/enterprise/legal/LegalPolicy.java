package io.aerodyne.enterprise.legal;

import java.math.BigDecimal;

public final class LegalPolicy {
    public boolean requiresApproval(LegalRecord record) {
        return record.amount().compareTo(new BigDecimal("10000")) >= 0 || record.priority() == io.aerodyne.enterprise.PriorityLevel.CRITICAL;
    }

    public boolean canClose(LegalRecord record) {
        return record.status() == LegalStatus.APPROVED || record.status() == LegalStatus.POSTED;
    }
}
