package io.aerodyne.enterprise.analytics;

import io.aerodyne.enterprise.EnterpriseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class AnalyticsRepository implements EnterpriseRepository<AnalyticsRecord> {
    private final List<AnalyticsRecord> records = new ArrayList<>();

    @Override
    public AnalyticsRecord save(AnalyticsRecord item) {
        records.add(item);
        return item;
    }

    @Override
    public List<AnalyticsRecord> findAll() {
        return Collections.unmodifiableList(records);
    }

    @Override
    public long count() {
        return records.size();
    }
}
