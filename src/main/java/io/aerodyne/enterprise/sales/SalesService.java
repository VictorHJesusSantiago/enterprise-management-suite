package io.aerodyne.enterprise.sales;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public final class SalesService {
    private final SalesRepository repository;
    private final SalesValidator validator = new SalesValidator();

    public SalesService(SalesRepository repository) {
        this.repository = repository;
    }

    public SalesRecord open(String id, String title, String owner, BigDecimal amount, LocalDate dueDate) {
        SalesRecord record = new SalesRecord(id, title, owner, amount, dueDate, SalesStatus.UNDER_REVIEW, io.aerodyne.enterprise.PriorityLevel.NORMAL);
        validator.requireValid(record);
        return repository.save(record);
    }

    public List<SalesRecord> list() {
        return repository.findAll();
    }
}
