package io.aerodyne.enterprise.risk;

public final class RiskWorkflow {
    public RiskStatus next(RiskStatus current, boolean approved) {
        if (current == RiskStatus.DRAFT) {
            return RiskStatus.UNDER_REVIEW;
        }
        if (current == RiskStatus.UNDER_REVIEW && approved) {
            return RiskStatus.APPROVED;
        }
        if (current == RiskStatus.APPROVED) {
            return RiskStatus.POSTED;
        }
        return current;
    }
}
