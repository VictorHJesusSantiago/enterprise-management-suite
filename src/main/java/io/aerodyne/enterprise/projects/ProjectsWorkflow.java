package io.aerodyne.enterprise.projects;

public final class ProjectsWorkflow {
    public ProjectsStatus next(ProjectsStatus current, boolean approved) {
        if (current == ProjectsStatus.DRAFT) {
            return ProjectsStatus.UNDER_REVIEW;
        }
        if (current == ProjectsStatus.UNDER_REVIEW && approved) {
            return ProjectsStatus.APPROVED;
        }
        if (current == ProjectsStatus.APPROVED) {
            return ProjectsStatus.POSTED;
        }
        return current;
    }
}
