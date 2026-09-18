package io.aerodyne.enterprise.procurement;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public final class ProcurementService {
    private final ProcurementRepository repository;
    private final ProcurementValidator validator = new ProcurementValidator();

    public ProcurementService(ProcurementRepository repository) {
        this.repository = repository;
    }

    public ProcurementRecord open(String id, String title, String owner, BigDecimal amount, LocalDate dueDate) {
        ProcurementRecord record = new ProcurementRecord(id, title, owner, amount, dueDate, ProcurementStatus.UNDER_REVIEW, io.aerodyne.enterprise.PriorityLevel.NORMAL);
        validator.requireValid(record);
        return repository.save(record);
    }

    public List<ProcurementRecord> list() {
        return repository.findAll();
    }
}
