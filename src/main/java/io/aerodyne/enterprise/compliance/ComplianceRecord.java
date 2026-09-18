package io.aerodyne.enterprise.compliance;

import io.aerodyne.enterprise.PriorityLevel;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public record ComplianceRecord(String id, String title, String owner, BigDecimal amount, LocalDate dueDate, ComplianceStatus status, PriorityLevel priority) {
    public ComplianceRecord {
        Objects.requireNonNull(id, "id");
        Objects.requireNonNull(title, "title");
        Objects.requireNonNull(owner, "owner");
        amount = amount == null ? BigDecimal.ZERO : amount;
        dueDate = dueDate == null ? LocalDate.now() : dueDate;
        status = status == null ? ComplianceStatus.DRAFT : status;
        priority = priority == null ? PriorityLevel.NORMAL : priority;
    }
}
