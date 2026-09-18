package io.aerodyne.enterprise.inventory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public final class InventoryService {
    private final InventoryRepository repository;
    private final InventoryValidator validator = new InventoryValidator();

    public InventoryService(InventoryRepository repository) {
        this.repository = repository;
    }

    public InventoryRecord open(String id, String title, String owner, BigDecimal amount, LocalDate dueDate) {
        InventoryRecord record = new InventoryRecord(id, title, owner, amount, dueDate, InventoryStatus.UNDER_REVIEW, io.aerodyne.enterprise.PriorityLevel.NORMAL);
        validator.requireValid(record);
        return repository.save(record);
    }

    public List<InventoryRecord> list() {
        return repository.findAll();
    }
}
