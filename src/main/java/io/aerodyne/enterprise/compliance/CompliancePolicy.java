package io.aerodyne.enterprise.compliance;

import java.math.BigDecimal;

public final class CompliancePolicy {
    public boolean requiresApproval(ComplianceRecord record) {
        return record.amount().compareTo(new BigDecimal("10000")) >= 0 || record.priority() == io.aerodyne.enterprise.PriorityLevel.CRITICAL;
    }

    public boolean canClose(ComplianceRecord record) {
        return record.status() == ComplianceStatus.APPROVED || record.status() == ComplianceStatus.POSTED;
    }
}
