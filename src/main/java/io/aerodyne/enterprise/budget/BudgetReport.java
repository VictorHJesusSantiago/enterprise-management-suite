package io.aerodyne.enterprise.budget;

import java.math.BigDecimal;
import java.util.List;

public record BudgetReport(long totalRecords, BigDecimal totalAmount, String description) {
    public static BudgetReport from(List<BudgetRecord> records) {
        BigDecimal total = records.stream().map(BudgetRecord::amount).reduce(BigDecimal.ZERO, BigDecimal::add);
        return new BudgetReport(records.size(), total, "orcamento e controladoria");
    }
}
