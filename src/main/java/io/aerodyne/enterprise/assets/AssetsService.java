package io.aerodyne.enterprise.assets;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public final class AssetsService {
    private final AssetsRepository repository;
    private final AssetsValidator validator = new AssetsValidator();

    public AssetsService(AssetsRepository repository) {
        this.repository = repository;
    }

    public AssetsRecord open(String id, String title, String owner, BigDecimal amount, LocalDate dueDate) {
        AssetsRecord record = new AssetsRecord(id, title, owner, amount, dueDate, AssetsStatus.UNDER_REVIEW, io.aerodyne.enterprise.PriorityLevel.NORMAL);
        validator.requireValid(record);
        return repository.save(record);
    }

    public List<AssetsRecord> list() {
        return repository.findAll();
    }
}
