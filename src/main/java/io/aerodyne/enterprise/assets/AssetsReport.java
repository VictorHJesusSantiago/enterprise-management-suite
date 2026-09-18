package io.aerodyne.enterprise.assets;

import java.math.BigDecimal;
import java.util.List;

public record AssetsReport(long totalRecords, BigDecimal totalAmount, String description) {
    public static AssetsReport from(List<AssetsRecord> records) {
        BigDecimal total = records.stream().map(AssetsRecord::amount).reduce(BigDecimal.ZERO, BigDecimal::add);
        return new AssetsReport(records.size(), total, "ativos patrimoniais");
    }
}
