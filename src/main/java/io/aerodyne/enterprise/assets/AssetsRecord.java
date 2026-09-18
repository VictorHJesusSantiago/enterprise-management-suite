package io.aerodyne.enterprise.assets;

import io.aerodyne.enterprise.PriorityLevel;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public record AssetsRecord(String id, String title, String owner, BigDecimal amount, LocalDate dueDate, AssetsStatus status, PriorityLevel priority) {
    public AssetsRecord {
        Objects.requireNonNull(id, "id");
        Objects.requireNonNull(title, "title");
        Objects.requireNonNull(owner, "owner");
        amount = amount == null ? BigDecimal.ZERO : amount;
        dueDate = dueDate == null ? LocalDate.now() : dueDate;
        status = status == null ? AssetsStatus.DRAFT : status;
        priority = priority == null ? PriorityLevel.NORMAL : priority;
    }
}
