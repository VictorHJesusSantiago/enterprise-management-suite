package io.aerodyne.enterprise.service;

import java.math.BigDecimal;

public final class ServiceDeskPolicy {
    public boolean requiresApproval(ServiceDeskRecord record) {
        return record.amount().compareTo(new BigDecimal("10000")) >= 0 || record.priority() == io.aerodyne.enterprise.PriorityLevel.CRITICAL;
    }

    public boolean canClose(ServiceDeskRecord record) {
        return record.status() == ServiceDeskStatus.APPROVED || record.status() == ServiceDeskStatus.POSTED;
    }
}
