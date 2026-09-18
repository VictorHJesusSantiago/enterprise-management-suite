package io.aerodyne.enterprise.compliance;

public final class ComplianceWorkflow {
    public ComplianceStatus next(ComplianceStatus current, boolean approved) {
        if (current == ComplianceStatus.DRAFT) {
            return ComplianceStatus.UNDER_REVIEW;
        }
        if (current == ComplianceStatus.UNDER_REVIEW && approved) {
            return ComplianceStatus.APPROVED;
        }
        if (current == ComplianceStatus.APPROVED) {
            return ComplianceStatus.POSTED;
        }
        return current;
    }
}
