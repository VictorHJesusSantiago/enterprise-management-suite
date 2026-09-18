package io.aerodyne.enterprise.projects;

import io.aerodyne.enterprise.EnterpriseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ProjectsRepository implements EnterpriseRepository<ProjectsRecord> {
    private final List<ProjectsRecord> records = new ArrayList<>();

    @Override
    public ProjectsRecord save(ProjectsRecord item) {
        records.add(item);
        return item;
    }

    @Override
    public List<ProjectsRecord> findAll() {
        return Collections.unmodifiableList(records);
    }

    @Override
    public long count() {
        return records.size();
    }
}
