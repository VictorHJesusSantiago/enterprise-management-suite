package io.aerodyne.enterprise.hr;

public final class HumanResourcesWorkflow {
    public HumanResourcesStatus next(HumanResourcesStatus current, boolean approved) {
        if (current == HumanResourcesStatus.DRAFT) {
            return HumanResourcesStatus.UNDER_REVIEW;
        }
        if (current == HumanResourcesStatus.UNDER_REVIEW && approved) {
            return HumanResourcesStatus.APPROVED;
        }
        if (current == HumanResourcesStatus.APPROVED) {
            return HumanResourcesStatus.POSTED;
        }
        return current;
    }
}
