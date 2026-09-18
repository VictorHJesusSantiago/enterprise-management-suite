package io.aerodyne.enterprise.hr;

import java.math.BigDecimal;
import java.util.List;

public record HumanResourcesReport(long totalRecords, BigDecimal totalAmount, String description) {
    public static HumanResourcesReport from(List<HumanResourcesRecord> records) {
        BigDecimal total = records.stream().map(HumanResourcesRecord::amount).reduce(BigDecimal.ZERO, BigDecimal::add);
        return new HumanResourcesReport(records.size(), total, "RH e pessoas");
    }
}
