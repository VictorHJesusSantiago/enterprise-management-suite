package io.aerodyne.enterprise.maintenance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public final class MaintenanceService {
    private final MaintenanceRepository repository;
    private final MaintenanceValidator validator = new MaintenanceValidator();

    public MaintenanceService(MaintenanceRepository repository) {
        this.repository = repository;
    }

    public MaintenanceRecord open(String id, String title, String owner, BigDecimal amount, LocalDate dueDate) {
        MaintenanceRecord record = new MaintenanceRecord(id, title, owner, amount, dueDate, MaintenanceStatus.UNDER_REVIEW, io.aerodyne.enterprise.PriorityLevel.NORMAL);
        validator.requireValid(record);
        return repository.save(record);
    }

    public List<MaintenanceRecord> list() {
        return repository.findAll();
    }
}
