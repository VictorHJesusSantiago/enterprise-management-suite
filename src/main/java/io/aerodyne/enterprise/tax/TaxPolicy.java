package io.aerodyne.enterprise.tax;

import java.math.BigDecimal;

public final class TaxPolicy {
    public boolean requiresApproval(TaxRecord record) {
        return record.amount().compareTo(new BigDecimal("10000")) >= 0 || record.priority() == io.aerodyne.enterprise.PriorityLevel.CRITICAL;
    }

    public boolean canClose(TaxRecord record) {
        return record.status() == TaxStatus.APPROVED || record.status() == TaxStatus.POSTED;
    }
}
