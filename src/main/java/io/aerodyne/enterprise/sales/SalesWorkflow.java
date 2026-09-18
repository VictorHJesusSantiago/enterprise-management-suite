package io.aerodyne.enterprise.sales;

public final class SalesWorkflow {
    public SalesStatus next(SalesStatus current, boolean approved) {
        if (current == SalesStatus.DRAFT) {
            return SalesStatus.UNDER_REVIEW;
        }
        if (current == SalesStatus.UNDER_REVIEW && approved) {
            return SalesStatus.APPROVED;
        }
        if (current == SalesStatus.APPROVED) {
            return SalesStatus.POSTED;
        }
        return current;
    }
}
