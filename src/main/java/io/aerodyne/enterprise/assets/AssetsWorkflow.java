package io.aerodyne.enterprise.assets;

public final class AssetsWorkflow {
    public AssetsStatus next(AssetsStatus current, boolean approved) {
        if (current == AssetsStatus.DRAFT) {
            return AssetsStatus.UNDER_REVIEW;
        }
        if (current == AssetsStatus.UNDER_REVIEW && approved) {
            return AssetsStatus.APPROVED;
        }
        if (current == AssetsStatus.APPROVED) {
            return AssetsStatus.POSTED;
        }
        return current;
    }
}
