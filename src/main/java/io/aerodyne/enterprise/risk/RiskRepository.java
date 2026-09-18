package io.aerodyne.enterprise.risk;

import io.aerodyne.enterprise.EnterpriseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class RiskRepository implements EnterpriseRepository<RiskRecord> {
    private final List<RiskRecord> records = new ArrayList<>();

    @Override
    public RiskRecord save(RiskRecord item) {
        records.add(item);
        return item;
    }

    @Override
    public List<RiskRecord> findAll() {
        return Collections.unmodifiableList(records);
    }

    @Override
    public long count() {
        return records.size();
    }
}
