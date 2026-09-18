package io.aerodyne.enterprise.tax;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public final class TaxService {
    private final TaxRepository repository;
    private final TaxValidator validator = new TaxValidator();

    public TaxService(TaxRepository repository) {
        this.repository = repository;
    }

    public TaxRecord open(String id, String title, String owner, BigDecimal amount, LocalDate dueDate) {
        TaxRecord record = new TaxRecord(id, title, owner, amount, dueDate, TaxStatus.UNDER_REVIEW, io.aerodyne.enterprise.PriorityLevel.NORMAL);
        validator.requireValid(record);
        return repository.save(record);
    }

    public List<TaxRecord> list() {
        return repository.findAll();
    }
}
