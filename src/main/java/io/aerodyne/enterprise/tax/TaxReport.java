package io.aerodyne.enterprise.tax;

import java.math.BigDecimal;
import java.util.List;

public record TaxReport(long totalRecords, BigDecimal totalAmount, String description) {
    public static TaxReport from(List<TaxRecord> records) {
        BigDecimal total = records.stream().map(TaxRecord::amount).reduce(BigDecimal.ZERO, BigDecimal::add);
        return new TaxReport(records.size(), total, "tributos e obrigacoes fiscais");
    }
}
