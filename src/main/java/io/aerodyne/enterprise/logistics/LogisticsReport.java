package io.aerodyne.enterprise.logistics;

import java.math.BigDecimal;
import java.util.List;

public record LogisticsReport(long totalRecords, BigDecimal totalAmount, String description) {
    public static LogisticsReport from(List<LogisticsRecord> records) {
        BigDecimal total = records.stream().map(LogisticsRecord::amount).reduce(BigDecimal.ZERO, BigDecimal::add);
        return new LogisticsReport(records.size(), total, "logistica e transporte");
    }
}
