package io.aerodyne.enterprise.analytics;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public final class AnalyticsService {
    private final AnalyticsRepository repository;
    private final AnalyticsValidator validator = new AnalyticsValidator();

    public AnalyticsService(AnalyticsRepository repository) {
        this.repository = repository;
    }

    public AnalyticsRecord open(String id, String title, String owner, BigDecimal amount, LocalDate dueDate) {
        AnalyticsRecord record = new AnalyticsRecord(id, title, owner, amount, dueDate, AnalyticsStatus.UNDER_REVIEW, io.aerodyne.enterprise.PriorityLevel.NORMAL);
        validator.requireValid(record);
        return repository.save(record);
    }

    public List<AnalyticsRecord> list() {
        return repository.findAll();
    }
}
