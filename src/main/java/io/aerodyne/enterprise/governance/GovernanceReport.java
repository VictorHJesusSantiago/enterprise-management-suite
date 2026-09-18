package io.aerodyne.enterprise.governance;

import java.math.BigDecimal;
import java.util.List;

public record GovernanceReport(long totalRecords, BigDecimal totalAmount, String description) {
    public static GovernanceReport from(List<GovernanceRecord> records) {
        BigDecimal total = records.stream().map(GovernanceRecord::amount).reduce(BigDecimal.ZERO, BigDecimal::add);
        return new GovernanceReport(records.size(), total, "governanca empresarial");
    }
}
