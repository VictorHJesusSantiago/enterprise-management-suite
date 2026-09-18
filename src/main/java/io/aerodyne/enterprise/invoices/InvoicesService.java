package io.aerodyne.enterprise.invoices;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public final class InvoicesService {
    private final InvoicesRepository repository;
    private final InvoicesValidator validator = new InvoicesValidator();

    public InvoicesService(InvoicesRepository repository) {
        this.repository = repository;
    }

    public InvoicesRecord open(String id, String title, String owner, BigDecimal amount, LocalDate dueDate) {
        InvoicesRecord record = new InvoicesRecord(id, title, owner, amount, dueDate, InvoicesStatus.UNDER_REVIEW, io.aerodyne.enterprise.PriorityLevel.NORMAL);
        validator.requireValid(record);
        return repository.save(record);
    }

    public List<InvoicesRecord> list() {
        return repository.findAll();
    }
}
