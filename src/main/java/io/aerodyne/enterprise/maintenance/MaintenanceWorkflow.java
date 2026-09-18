package io.aerodyne.enterprise.maintenance;

public final class MaintenanceWorkflow {
    public MaintenanceStatus next(MaintenanceStatus current, boolean approved) {
        if (current == MaintenanceStatus.DRAFT) {
            return MaintenanceStatus.UNDER_REVIEW;
        }
        if (current == MaintenanceStatus.UNDER_REVIEW && approved) {
            return MaintenanceStatus.APPROVED;
        }
        if (current == MaintenanceStatus.APPROVED) {
            return MaintenanceStatus.POSTED;
        }
        return current;
    }
}
