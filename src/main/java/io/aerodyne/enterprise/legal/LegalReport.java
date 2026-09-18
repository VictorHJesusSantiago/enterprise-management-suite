package io.aerodyne.enterprise.legal;

import java.math.BigDecimal;
import java.util.List;

public record LegalReport(long totalRecords, BigDecimal totalAmount, String description) {
    public static LegalReport from(List<LegalRecord> records) {
        BigDecimal total = records.stream().map(LegalRecord::amount).reduce(BigDecimal.ZERO, BigDecimal::add);
        return new LegalReport(records.size(), total, "juridico corporativo");
    }
}
