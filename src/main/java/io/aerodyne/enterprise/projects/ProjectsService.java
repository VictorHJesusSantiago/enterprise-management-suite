package io.aerodyne.enterprise.projects;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public final class ProjectsService {
    private final ProjectsRepository repository;
    private final ProjectsValidator validator = new ProjectsValidator();

    public ProjectsService(ProjectsRepository repository) {
        this.repository = repository;
    }

    public ProjectsRecord open(String id, String title, String owner, BigDecimal amount, LocalDate dueDate) {
        ProjectsRecord record = new ProjectsRecord(id, title, owner, amount, dueDate, ProjectsStatus.UNDER_REVIEW, io.aerodyne.enterprise.PriorityLevel.NORMAL);
        validator.requireValid(record);
        return repository.save(record);
    }

    public List<ProjectsRecord> list() {
        return repository.findAll();
    }
}
