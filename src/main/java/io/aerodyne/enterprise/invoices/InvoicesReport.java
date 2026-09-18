package io.aerodyne.enterprise.invoices;

import java.math.BigDecimal;
import java.util.List;

public record InvoicesReport(long totalRecords, BigDecimal totalAmount, String description) {
    public static InvoicesReport from(List<InvoicesRecord> records) {
        BigDecimal total = records.stream().map(InvoicesRecord::amount).reduce(BigDecimal.ZERO, BigDecimal::add);
        return new InvoicesReport(records.size(), total, "notas fiscais e faturamento");
    }
}
