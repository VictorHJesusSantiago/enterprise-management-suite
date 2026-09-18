package io.aerodyne.enterprise.payroll;

import java.math.BigDecimal;

public final class PayrollPolicy {
    public boolean requiresApproval(PayrollRecord record) {
        return record.amount().compareTo(new BigDecimal("10000")) >= 0 || record.priority() == io.aerodyne.enterprise.PriorityLevel.CRITICAL;
    }

    public boolean canClose(PayrollRecord record) {
        return record.status() == PayrollStatus.APPROVED || record.status() == PayrollStatus.POSTED;
    }
}
