package io.aerodyne.enterprise.governance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public final class GovernanceService {
    private final GovernanceRepository repository;
    private final GovernanceValidator validator = new GovernanceValidator();

    public GovernanceService(GovernanceRepository repository) {
        this.repository = repository;
    }

    public GovernanceRecord open(String id, String title, String owner, BigDecimal amount, LocalDate dueDate) {
        GovernanceRecord record = new GovernanceRecord(id, title, owner, amount, dueDate, GovernanceStatus.UNDER_REVIEW, io.aerodyne.enterprise.PriorityLevel.NORMAL);
        validator.requireValid(record);
        return repository.save(record);
    }

    public List<GovernanceRecord> list() {
        return repository.findAll();
    }
}
