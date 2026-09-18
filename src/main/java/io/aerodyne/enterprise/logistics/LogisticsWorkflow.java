package io.aerodyne.enterprise.logistics;

public final class LogisticsWorkflow {
    public LogisticsStatus next(LogisticsStatus current, boolean approved) {
        if (current == LogisticsStatus.DRAFT) {
            return LogisticsStatus.UNDER_REVIEW;
        }
        if (current == LogisticsStatus.UNDER_REVIEW && approved) {
            return LogisticsStatus.APPROVED;
        }
        if (current == LogisticsStatus.APPROVED) {
            return LogisticsStatus.POSTED;
        }
        return current;
    }
}
