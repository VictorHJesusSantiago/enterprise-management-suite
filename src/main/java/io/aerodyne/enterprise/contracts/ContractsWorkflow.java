package io.aerodyne.enterprise.contracts;

public final class ContractsWorkflow {
    public ContractsStatus next(ContractsStatus current, boolean approved) {
        if (current == ContractsStatus.DRAFT) {
            return ContractsStatus.UNDER_REVIEW;
        }
        if (current == ContractsStatus.UNDER_REVIEW && approved) {
            return ContractsStatus.APPROVED;
        }
        if (current == ContractsStatus.APPROVED) {
            return ContractsStatus.POSTED;
        }
        return current;
    }
}
