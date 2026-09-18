package io.aerodyne.enterprise.legal;

public final class LegalWorkflow {
    public LegalStatus next(LegalStatus current, boolean approved) {
        if (current == LegalStatus.DRAFT) {
            return LegalStatus.UNDER_REVIEW;
        }
        if (current == LegalStatus.UNDER_REVIEW && approved) {
            return LegalStatus.APPROVED;
        }
        if (current == LegalStatus.APPROVED) {
            return LegalStatus.POSTED;
        }
        return current;
    }
}
