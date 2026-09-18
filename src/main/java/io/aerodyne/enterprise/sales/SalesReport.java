package io.aerodyne.enterprise.sales;

import java.math.BigDecimal;
import java.util.List;

public record SalesReport(long totalRecords, BigDecimal totalAmount, String description) {
    public static SalesReport from(List<SalesRecord> records) {
        BigDecimal total = records.stream().map(SalesRecord::amount).reduce(BigDecimal.ZERO, BigDecimal::add);
        return new SalesReport(records.size(), total, "vendas e CRM");
    }
}
