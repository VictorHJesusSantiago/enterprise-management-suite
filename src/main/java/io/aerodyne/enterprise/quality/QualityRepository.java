package io.aerodyne.enterprise.quality;

import io.aerodyne.enterprise.EnterpriseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class QualityRepository implements EnterpriseRepository<QualityRecord> {
    private final List<QualityRecord> records = new ArrayList<>();

    @Override
    public QualityRecord save(QualityRecord item) {
        records.add(item);
        return item;
    }

    @Override
    public List<QualityRecord> findAll() {
        return Collections.unmodifiableList(records);
    }

    @Override
    public long count() {
        return records.size();
    }
}
