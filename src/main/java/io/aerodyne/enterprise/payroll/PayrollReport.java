package io.aerodyne.enterprise.payroll;

import java.math.BigDecimal;
import java.util.List;

public record PayrollReport(long totalRecords, BigDecimal totalAmount, String description) {
    public static PayrollReport from(List<PayrollRecord> records) {
        BigDecimal total = records.stream().map(PayrollRecord::amount).reduce(BigDecimal.ZERO, BigDecimal::add);
        return new PayrollReport(records.size(), total, "folha de pagamento");
    }
}
