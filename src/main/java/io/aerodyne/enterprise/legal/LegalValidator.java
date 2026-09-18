package io.aerodyne.enterprise.legal;

import io.aerodyne.enterprise.ValidationIssue;
import java.util.ArrayList;
import java.util.List;

public final class LegalValidator {
    public List<ValidationIssue> validate(LegalRecord record) {
        List<ValidationIssue> issues = new ArrayList<>();
        if (record.title().isBlank()) {
            issues.add(new ValidationIssue("title", "must not be blank"));
        }
        if (record.owner().isBlank()) {
            issues.add(new ValidationIssue("owner", "must not be blank"));
        }
        return issues;
    }

    public void requireValid(LegalRecord record) {
        List<ValidationIssue> issues = validate(record);
        if (!issues.isEmpty()) {
            throw new IllegalArgumentException(issues.toString());
        }
    }
}
