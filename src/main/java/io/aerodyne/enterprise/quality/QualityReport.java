package io.aerodyne.enterprise.quality;

import java.math.BigDecimal;
import java.util.List;

public record QualityReport(long totalRecords, BigDecimal totalAmount, String description) {
    public static QualityReport from(List<QualityRecord> records) {
        BigDecimal total = records.stream().map(QualityRecord::amount).reduce(BigDecimal.ZERO, BigDecimal::add);
        return new QualityReport(records.size(), total, "qualidade e nao conformidades");
    }
}
