package io.aerodyne.enterprise.inventory;

import java.math.BigDecimal;
import java.util.List;

public record InventoryReport(long totalRecords, BigDecimal totalAmount, String description) {
    public static InventoryReport from(List<InventoryRecord> records) {
        BigDecimal total = records.stream().map(InventoryRecord::amount).reduce(BigDecimal.ZERO, BigDecimal::add);
        return new InventoryReport(records.size(), total, "estoque e almoxarifado");
    }
}
