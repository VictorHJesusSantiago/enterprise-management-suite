package io.aerodyne.enterprise.analytics;

import java.math.BigDecimal;
import java.util.List;

public record AnalyticsReport(long totalRecords, BigDecimal totalAmount, String description) {
    public static AnalyticsReport from(List<AnalyticsRecord> records) {
        BigDecimal total = records.stream().map(AnalyticsRecord::amount).reduce(BigDecimal.ZERO, BigDecimal::add);
        return new AnalyticsReport(records.size(), total, "indicadores e BI");
    }
}
