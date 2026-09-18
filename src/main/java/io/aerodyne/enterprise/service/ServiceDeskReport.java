package io.aerodyne.enterprise.service;

import java.math.BigDecimal;
import java.util.List;

public record ServiceDeskReport(long totalRecords, BigDecimal totalAmount, String description) {
    public static ServiceDeskReport from(List<ServiceDeskRecord> records) {
        BigDecimal total = records.stream().map(ServiceDeskRecord::amount).reduce(BigDecimal.ZERO, BigDecimal::add);
        return new ServiceDeskReport(records.size(), total, "atendimento e chamados");
    }
}
