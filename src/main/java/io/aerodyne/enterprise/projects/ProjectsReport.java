package io.aerodyne.enterprise.projects;

import java.math.BigDecimal;
import java.util.List;

public record ProjectsReport(long totalRecords, BigDecimal totalAmount, String description) {
    public static ProjectsReport from(List<ProjectsRecord> records) {
        BigDecimal total = records.stream().map(ProjectsRecord::amount).reduce(BigDecimal.ZERO, BigDecimal::add);
        return new ProjectsReport(records.size(), total, "projetos e PMO");
    }
}
