package io.aerodyne.enterprise.hr;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public final class HumanResourcesService {
    private final HumanResourcesRepository repository;
    private final HumanResourcesValidator validator = new HumanResourcesValidator();

    public HumanResourcesService(HumanResourcesRepository repository) {
        this.repository = repository;
    }

    public HumanResourcesRecord open(String id, String title, String owner, BigDecimal amount, LocalDate dueDate) {
        HumanResourcesRecord record = new HumanResourcesRecord(id, title, owner, amount, dueDate, HumanResourcesStatus.UNDER_REVIEW, io.aerodyne.enterprise.PriorityLevel.NORMAL);
        validator.requireValid(record);
        return repository.save(record);
    }

    public List<HumanResourcesRecord> list() {
        return repository.findAll();
    }
}
