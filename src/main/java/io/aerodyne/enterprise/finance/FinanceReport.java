package io.aerodyne.enterprise.finance;

import java.math.BigDecimal;
import java.util.List;

public record FinanceReport(long totalRecords, BigDecimal totalAmount, String description) {
    public static FinanceReport from(List<FinanceRecord> records) {
        BigDecimal total = records.stream().map(FinanceRecord::amount).reduce(BigDecimal.ZERO, BigDecimal::add);
        return new FinanceReport(records.size(), total, "financeiro e tesouraria");
    }
}
