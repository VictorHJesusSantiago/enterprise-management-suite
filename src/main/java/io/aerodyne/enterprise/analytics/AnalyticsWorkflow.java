package io.aerodyne.enterprise.analytics;

public final class AnalyticsWorkflow {
    public AnalyticsStatus next(AnalyticsStatus current, boolean approved) {
        if (current == AnalyticsStatus.DRAFT) {
            return AnalyticsStatus.UNDER_REVIEW;
        }
        if (current == AnalyticsStatus.UNDER_REVIEW && approved) {
            return AnalyticsStatus.APPROVED;
        }
        if (current == AnalyticsStatus.APPROVED) {
            return AnalyticsStatus.POSTED;
        }
        return current;
    }
}
