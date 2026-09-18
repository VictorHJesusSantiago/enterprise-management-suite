package io.aerodyne.enterprise.logistics;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public final class LogisticsService {
    private final LogisticsRepository repository;
    private final LogisticsValidator validator = new LogisticsValidator();

    public LogisticsService(LogisticsRepository repository) {
        this.repository = repository;
    }

    public LogisticsRecord open(String id, String title, String owner, BigDecimal amount, LocalDate dueDate) {
        LogisticsRecord record = new LogisticsRecord(id, title, owner, amount, dueDate, LogisticsStatus.UNDER_REVIEW, io.aerodyne.enterprise.PriorityLevel.NORMAL);
        validator.requireValid(record);
        return repository.save(record);
    }

    public List<LogisticsRecord> list() {
        return repository.findAll();
    }
}
