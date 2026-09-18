package io.aerodyne.enterprise.finance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public final class FinanceService {
    private final FinanceRepository repository;
    private final FinanceValidator validator = new FinanceValidator();

    public FinanceService(FinanceRepository repository) {
        this.repository = repository;
    }

    public FinanceRecord open(String id, String title, String owner, BigDecimal amount, LocalDate dueDate) {
        FinanceRecord record = new FinanceRecord(id, title, owner, amount, dueDate, FinanceStatus.UNDER_REVIEW, io.aerodyne.enterprise.PriorityLevel.NORMAL);
        validator.requireValid(record);
        return repository.save(record);
    }

    public List<FinanceRecord> list() {
        return repository.findAll();
    }
}
