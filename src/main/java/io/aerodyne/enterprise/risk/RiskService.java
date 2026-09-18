package io.aerodyne.enterprise.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public final class RiskService {
    private final RiskRepository repository;
    private final RiskValidator validator = new RiskValidator();

    public RiskService(RiskRepository repository) {
        this.repository = repository;
    }

    public RiskRecord open(String id, String title, String owner, BigDecimal amount, LocalDate dueDate) {
        RiskRecord record = new RiskRecord(id, title, owner, amount, dueDate, RiskStatus.UNDER_REVIEW, io.aerodyne.enterprise.PriorityLevel.NORMAL);
        validator.requireValid(record);
        return repository.save(record);
    }

    public List<RiskRecord> list() {
        return repository.findAll();
    }
}
