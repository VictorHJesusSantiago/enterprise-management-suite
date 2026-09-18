package io.aerodyne.enterprise.maintenance;

import java.math.BigDecimal;
import java.util.List;

public record MaintenanceReport(long totalRecords, BigDecimal totalAmount, String description) {
    public static MaintenanceReport from(List<MaintenanceRecord> records) {
        BigDecimal total = records.stream().map(MaintenanceRecord::amount).reduce(BigDecimal.ZERO, BigDecimal::add);
        return new MaintenanceReport(records.size(), total, "manutencao industrial");
    }
}
