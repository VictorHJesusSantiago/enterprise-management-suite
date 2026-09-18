package io.aerodyne.enterprise.legal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public final class LegalService {
    private final LegalRepository repository;
    private final LegalValidator validator = new LegalValidator();

    public LegalService(LegalRepository repository) {
        this.repository = repository;
    }

    public LegalRecord open(String id, String title, String owner, BigDecimal amount, LocalDate dueDate) {
        LegalRecord record = new LegalRecord(id, title, owner, amount, dueDate, LegalStatus.UNDER_REVIEW, io.aerodyne.enterprise.PriorityLevel.NORMAL);
        validator.requireValid(record);
        return repository.save(record);
    }

    public List<LegalRecord> list() {
        return repository.findAll();
    }
}
