package io.aerodyne.enterprise.governance;

public final class GovernanceWorkflow {
    public GovernanceStatus next(GovernanceStatus current, boolean approved) {
        if (current == GovernanceStatus.DRAFT) {
            return GovernanceStatus.UNDER_REVIEW;
        }
        if (current == GovernanceStatus.UNDER_REVIEW && approved) {
            return GovernanceStatus.APPROVED;
        }
        if (current == GovernanceStatus.APPROVED) {
            return GovernanceStatus.POSTED;
        }
        return current;
    }
}
