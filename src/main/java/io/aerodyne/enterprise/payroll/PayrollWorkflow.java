package io.aerodyne.enterprise.payroll;

public final class PayrollWorkflow {
    public PayrollStatus next(PayrollStatus current, boolean approved) {
        if (current == PayrollStatus.DRAFT) {
            return PayrollStatus.UNDER_REVIEW;
        }
        if (current == PayrollStatus.UNDER_REVIEW && approved) {
            return PayrollStatus.APPROVED;
        }
        if (current == PayrollStatus.APPROVED) {
            return PayrollStatus.POSTED;
        }
        return current;
    }
}
