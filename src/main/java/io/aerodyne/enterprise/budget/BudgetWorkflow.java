package io.aerodyne.enterprise.budget;

public final class BudgetWorkflow {
    public BudgetStatus next(BudgetStatus current, boolean approved) {
        if (current == BudgetStatus.DRAFT) {
            return BudgetStatus.UNDER_REVIEW;
        }
        if (current == BudgetStatus.UNDER_REVIEW && approved) {
            return BudgetStatus.APPROVED;
        }
        if (current == BudgetStatus.APPROVED) {
            return BudgetStatus.POSTED;
        }
        return current;
    }
}
