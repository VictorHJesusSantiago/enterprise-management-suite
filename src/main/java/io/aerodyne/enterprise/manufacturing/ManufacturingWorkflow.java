package io.aerodyne.enterprise.manufacturing;

public final class ManufacturingWorkflow {
    public ManufacturingStatus next(ManufacturingStatus current, boolean approved) {
        if (current == ManufacturingStatus.DRAFT) {
            return ManufacturingStatus.UNDER_REVIEW;
        }
        if (current == ManufacturingStatus.UNDER_REVIEW && approved) {
            return ManufacturingStatus.APPROVED;
        }
        if (current == ManufacturingStatus.APPROVED) {
            return ManufacturingStatus.POSTED;
        }
        return current;
    }
}
