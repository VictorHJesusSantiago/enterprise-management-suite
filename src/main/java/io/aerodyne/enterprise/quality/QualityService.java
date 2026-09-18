package io.aerodyne.enterprise.quality;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public final class QualityService {
    private final QualityRepository repository;
    private final QualityValidator validator = new QualityValidator();

    public QualityService(QualityRepository repository) {
        this.repository = repository;
    }

    public QualityRecord open(String id, String title, String owner, BigDecimal amount, LocalDate dueDate) {
        QualityRecord record = new QualityRecord(id, title, owner, amount, dueDate, QualityStatus.UNDER_REVIEW, io.aerodyne.enterprise.PriorityLevel.NORMAL);
        validator.requireValid(record);
        return repository.save(record);
    }

    public List<QualityRecord> list() {
        return repository.findAll();
    }
}
