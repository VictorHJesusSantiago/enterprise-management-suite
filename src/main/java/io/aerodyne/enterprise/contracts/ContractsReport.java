package io.aerodyne.enterprise.contracts;

import java.math.BigDecimal;
import java.util.List;

public record ContractsReport(long totalRecords, BigDecimal totalAmount, String description) {
    public static ContractsReport from(List<ContractsRecord> records) {
        BigDecimal total = records.stream().map(ContractsRecord::amount).reduce(BigDecimal.ZERO, BigDecimal::add);
        return new ContractsReport(records.size(), total, "contratos e acordos");
    }
}
