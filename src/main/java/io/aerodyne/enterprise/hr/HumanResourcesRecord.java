package io.aerodyne.enterprise.hr;

import io.aerodyne.enterprise.PriorityLevel;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public record HumanResourcesRecord(String id, String title, String owner, BigDecimal amount, LocalDate dueDate, HumanResourcesStatus status, PriorityLevel priority) {
    public HumanResourcesRecord {
        Objects.requireNonNull(id, "id");
        Objects.requireNonNull(title, "title");
        Objects.requireNonNull(owner, "owner");
        amount = amount == null ? BigDecimal.ZERO : amount;
        dueDate = dueDate == null ? LocalDate.now() : dueDate;
        status = status == null ? HumanResourcesStatus.DRAFT : status;
        priority = priority == null ? PriorityLevel.NORMAL : priority;
    }
}
