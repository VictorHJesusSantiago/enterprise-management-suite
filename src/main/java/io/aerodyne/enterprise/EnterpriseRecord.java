package io.aerodyne.enterprise;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public record EnterpriseRecord(String id, String title, String owner, BigDecimal amount, LocalDate dueDate) {
    public EnterpriseRecord {
        Objects.requireNonNull(id, "id");
        Objects.requireNonNull(title, "title");
        Objects.requireNonNull(owner, "owner");
        amount = amount == null ? BigDecimal.ZERO : amount;
        dueDate = dueDate == null ? LocalDate.now() : dueDate;
    }
}
