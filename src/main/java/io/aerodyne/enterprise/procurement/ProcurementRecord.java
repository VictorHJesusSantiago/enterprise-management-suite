package io.aerodyne.enterprise.procurement;

import io.aerodyne.enterprise.PriorityLevel;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public record ProcurementRecord(String id, String title, String owner, BigDecimal amount, LocalDate dueDate, ProcurementStatus status, PriorityLevel priority) {
    public ProcurementRecord {
        Objects.requireNonNull(id, "id");
        Objects.requireNonNull(title, "title");
        Objects.requireNonNull(owner, "owner");
        amount = amount == null ? BigDecimal.ZERO : amount;
        dueDate = dueDate == null ? LocalDate.now() : dueDate;
        status = status == null ? ProcurementStatus.DRAFT : status;
        priority = priority == null ? PriorityLevel.NORMAL : priority;
    }
}
