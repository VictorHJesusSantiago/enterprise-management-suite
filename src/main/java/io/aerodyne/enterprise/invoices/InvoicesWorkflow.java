package io.aerodyne.enterprise.invoices;

public final class InvoicesWorkflow {
    public InvoicesStatus next(InvoicesStatus current, boolean approved) {
        if (current == InvoicesStatus.DRAFT) {
            return InvoicesStatus.UNDER_REVIEW;
        }
        if (current == InvoicesStatus.UNDER_REVIEW && approved) {
            return InvoicesStatus.APPROVED;
        }
        if (current == InvoicesStatus.APPROVED) {
            return InvoicesStatus.POSTED;
        }
        return current;
    }
}
