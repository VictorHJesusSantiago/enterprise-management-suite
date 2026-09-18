package io.aerodyne.enterprise.manufacturing;

import java.math.BigDecimal;
import java.util.List;

public record ManufacturingReport(long totalRecords, BigDecimal totalAmount, String description) {
    public static ManufacturingReport from(List<ManufacturingRecord> records) {
        BigDecimal total = records.stream().map(ManufacturingRecord::amount).reduce(BigDecimal.ZERO, BigDecimal::add);
        return new ManufacturingReport(records.size(), total, "manufatura e producao");
    }
}
