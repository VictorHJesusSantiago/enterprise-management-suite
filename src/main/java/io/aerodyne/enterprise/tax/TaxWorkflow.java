package io.aerodyne.enterprise.tax;

public final class TaxWorkflow {
    public TaxStatus next(TaxStatus current, boolean approved) {
        if (current == TaxStatus.DRAFT) {
            return TaxStatus.UNDER_REVIEW;
        }
        if (current == TaxStatus.UNDER_REVIEW && approved) {
            return TaxStatus.APPROVED;
        }
        if (current == TaxStatus.APPROVED) {
            return TaxStatus.POSTED;
        }
        return current;
    }
}
