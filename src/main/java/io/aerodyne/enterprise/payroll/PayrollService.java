package io.aerodyne.enterprise.payroll;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public final class PayrollService {
    private final PayrollRepository repository;
    private final PayrollValidator validator = new PayrollValidator();

    public PayrollService(PayrollRepository repository) {
        this.repository = repository;
    }

    public PayrollRecord open(String id, String title, String owner, BigDecimal amount, LocalDate dueDate) {
        PayrollRecord record = new PayrollRecord(id, title, owner, amount, dueDate, PayrollStatus.UNDER_REVIEW, io.aerodyne.enterprise.PriorityLevel.NORMAL);
        validator.requireValid(record);
        return repository.save(record);
    }

    public List<PayrollRecord> list() {
        return repository.findAll();
    }
}
