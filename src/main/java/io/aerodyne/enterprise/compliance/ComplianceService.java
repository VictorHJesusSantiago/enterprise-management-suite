package io.aerodyne.enterprise.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public final class ComplianceService {
    private final ComplianceRepository repository;
    private final ComplianceValidator validator = new ComplianceValidator();

    public ComplianceService(ComplianceRepository repository) {
        this.repository = repository;
    }

    public ComplianceRecord open(String id, String title, String owner, BigDecimal amount, LocalDate dueDate) {
        ComplianceRecord record = new ComplianceRecord(id, title, owner, amount, dueDate, ComplianceStatus.UNDER_REVIEW, io.aerodyne.enterprise.PriorityLevel.NORMAL);
        validator.requireValid(record);
        return repository.save(record);
    }

    public List<ComplianceRecord> list() {
        return repository.findAll();
    }
}
