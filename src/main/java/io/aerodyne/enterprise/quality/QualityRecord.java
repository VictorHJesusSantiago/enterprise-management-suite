package io.aerodyne.enterprise.quality;

import io.aerodyne.enterprise.PriorityLevel;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public record QualityRecord(String id, String title, String owner, BigDecimal amount, LocalDate dueDate, QualityStatus status, PriorityLevel priority) {
    public QualityRecord {
        Objects.requireNonNull(id, "id");
        Objects.requireNonNull(title, "title");
        Objects.requireNonNull(owner, "owner");
        amount = amount == null ? BigDecimal.ZERO : amount;
        dueDate = dueDate == null ? LocalDate.now() : dueDate;
        status = status == null ? QualityStatus.DRAFT : status;
        priority = priority == null ? PriorityLevel.NORMAL : priority;
    }
}
