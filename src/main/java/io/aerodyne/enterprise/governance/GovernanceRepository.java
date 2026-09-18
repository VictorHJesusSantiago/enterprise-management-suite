package io.aerodyne.enterprise.governance;

import io.aerodyne.enterprise.EnterpriseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class GovernanceRepository implements EnterpriseRepository<GovernanceRecord> {
    private final List<GovernanceRecord> records = new ArrayList<>();

    @Override
    public GovernanceRecord save(GovernanceRecord item) {
        records.add(item);
        return item;
    }

    @Override
    public List<GovernanceRecord> findAll() {
        return Collections.unmodifiableList(records);
    }

    @Override
    public long count() {
        return records.size();
    }
}
