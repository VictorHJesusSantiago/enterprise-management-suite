package io.aerodyne.enterprise.quality;

public final class QualityWorkflow {
    public QualityStatus next(QualityStatus current, boolean approved) {
        if (current == QualityStatus.DRAFT) {
            return QualityStatus.UNDER_REVIEW;
        }
        if (current == QualityStatus.UNDER_REVIEW && approved) {
            return QualityStatus.APPROVED;
        }
        if (current == QualityStatus.APPROVED) {
            return QualityStatus.POSTED;
        }
        return current;
    }
}
