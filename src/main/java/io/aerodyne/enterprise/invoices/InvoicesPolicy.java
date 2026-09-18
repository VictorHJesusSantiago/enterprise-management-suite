package io.aerodyne.enterprise.invoices;

import java.math.BigDecimal;

public final class InvoicesPolicy {
    public boolean requiresApproval(InvoicesRecord record) {
        return record.amount().compareTo(new BigDecimal("10000")) >= 0 || record.priority() == io.aerodyne.enterprise.PriorityLevel.CRITICAL;
    }

    public boolean canClose(InvoicesRecord record) {
        return record.status() == InvoicesStatus.APPROVED || record.status() == InvoicesStatus.POSTED;
    }
}
