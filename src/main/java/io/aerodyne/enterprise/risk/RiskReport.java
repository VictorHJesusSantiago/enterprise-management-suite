package io.aerodyne.enterprise.risk;

import java.math.BigDecimal;
import java.util.List;

public record RiskReport(long totalRecords, BigDecimal totalAmount, String description) {
    public static RiskReport from(List<RiskRecord> records) {
        BigDecimal total = records.stream().map(RiskRecord::amount).reduce(BigDecimal.ZERO, BigDecimal::add);
        return new RiskReport(records.size(), total, "riscos corporativos");
    }
}
