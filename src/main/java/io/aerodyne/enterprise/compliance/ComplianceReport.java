package io.aerodyne.enterprise.compliance;

import java.math.BigDecimal;
import java.util.List;

public record ComplianceReport(long totalRecords, BigDecimal totalAmount, String description) {
    public static ComplianceReport from(List<ComplianceRecord> records) {
        BigDecimal total = records.stream().map(ComplianceRecord::amount).reduce(BigDecimal.ZERO, BigDecimal::add);
        return new ComplianceReport(records.size(), total, "conformidade e auditoria");
    }
}
