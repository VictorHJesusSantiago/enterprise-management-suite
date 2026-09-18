package io.aerodyne.enterprise.logistics;

import io.aerodyne.enterprise.EnterpriseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LogisticsRepository implements EnterpriseRepository<LogisticsRecord> {
    private final List<LogisticsRecord> records = new ArrayList<>();

    @Override
    public LogisticsRecord save(LogisticsRecord item) {
        records.add(item);
        return item;
    }

    @Override
    public List<LogisticsRecord> findAll() {
        return Collections.unmodifiableList(records);
    }

    @Override
    public long count() {
        return records.size();
    }
}
