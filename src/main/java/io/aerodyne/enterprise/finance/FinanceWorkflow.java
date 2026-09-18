package io.aerodyne.enterprise.finance;

public final class FinanceWorkflow {
    public FinanceStatus next(FinanceStatus current, boolean approved) {
        if (current == FinanceStatus.DRAFT) {
            return FinanceStatus.UNDER_REVIEW;
        }
        if (current == FinanceStatus.UNDER_REVIEW && approved) {
            return FinanceStatus.APPROVED;
        }
        if (current == FinanceStatus.APPROVED) {
            return FinanceStatus.POSTED;
        }
        return current;
    }
}
