package io.aerodyne.enterprise.budget;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public final class BudgetService {
    private final BudgetRepository repository;
    private final BudgetValidator validator = new BudgetValidator();

    public BudgetService(BudgetRepository repository) {
        this.repository = repository;
    }

    public BudgetRecord open(String id, String title, String owner, BigDecimal amount, LocalDate dueDate) {
        BudgetRecord record = new BudgetRecord(id, title, owner, amount, dueDate, BudgetStatus.UNDER_REVIEW, io.aerodyne.enterprise.PriorityLevel.NORMAL);
        validator.requireValid(record);
        return repository.save(record);
    }

    public List<BudgetRecord> list() {
        return repository.findAll();
    }
}
