package io.aerodyne.enterprise.manufacturing;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public final class ManufacturingService {
    private final ManufacturingRepository repository;
    private final ManufacturingValidator validator = new ManufacturingValidator();

    public ManufacturingService(ManufacturingRepository repository) {
        this.repository = repository;
    }

    public ManufacturingRecord open(String id, String title, String owner, BigDecimal amount, LocalDate dueDate) {
        ManufacturingRecord record = new ManufacturingRecord(id, title, owner, amount, dueDate, ManufacturingStatus.UNDER_REVIEW, io.aerodyne.enterprise.PriorityLevel.NORMAL);
        validator.requireValid(record);
        return repository.save(record);
    }

    public List<ManufacturingRecord> list() {
        return repository.findAll();
    }
}
