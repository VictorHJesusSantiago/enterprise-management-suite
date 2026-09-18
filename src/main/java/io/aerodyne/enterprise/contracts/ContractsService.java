package io.aerodyne.enterprise.contracts;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public final class ContractsService {
    private final ContractsRepository repository;
    private final ContractsValidator validator = new ContractsValidator();

    public ContractsService(ContractsRepository repository) {
        this.repository = repository;
    }

    public ContractsRecord open(String id, String title, String owner, BigDecimal amount, LocalDate dueDate) {
        ContractsRecord record = new ContractsRecord(id, title, owner, amount, dueDate, ContractsStatus.UNDER_REVIEW, io.aerodyne.enterprise.PriorityLevel.NORMAL);
        validator.requireValid(record);
        return repository.save(record);
    }

    public List<ContractsRecord> list() {
        return repository.findAll();
    }
}
