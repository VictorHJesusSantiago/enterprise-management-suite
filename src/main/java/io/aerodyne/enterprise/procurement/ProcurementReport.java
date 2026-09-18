package io.aerodyne.enterprise.procurement;

import java.math.BigDecimal;
import java.util.List;

public record ProcurementReport(long totalRecords, BigDecimal totalAmount, String description) {
    public static ProcurementReport from(List<ProcurementRecord> records) {
        BigDecimal total = records.stream().map(ProcurementRecord::amount).reduce(BigDecimal.ZERO, BigDecimal::add);
        return new ProcurementReport(records.size(), total, "compras e fornecedores");
    }
}
