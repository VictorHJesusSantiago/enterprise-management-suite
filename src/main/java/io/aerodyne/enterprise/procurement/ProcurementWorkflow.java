package io.aerodyne.enterprise.procurement;

public final class ProcurementWorkflow {
    public ProcurementStatus next(ProcurementStatus current, boolean approved) {
        if (current == ProcurementStatus.DRAFT) {
            return ProcurementStatus.UNDER_REVIEW;
        }
        if (current == ProcurementStatus.UNDER_REVIEW && approved) {
            return ProcurementStatus.APPROVED;
        }
        if (current == ProcurementStatus.APPROVED) {
            return ProcurementStatus.POSTED;
        }
        return current;
    }
}
