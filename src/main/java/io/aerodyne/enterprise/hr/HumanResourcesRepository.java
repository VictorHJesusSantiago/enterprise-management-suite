package io.aerodyne.enterprise.hr;

import io.aerodyne.enterprise.EnterpriseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class HumanResourcesRepository implements EnterpriseRepository<HumanResourcesRecord> {
    private final List<HumanResourcesRecord> records = new ArrayList<>();

    @Override
    public HumanResourcesRecord save(HumanResourcesRecord item) {
        records.add(item);
        return item;
    }

    @Override
    public List<HumanResourcesRecord> findAll() {
        return Collections.unmodifiableList(records);
    }

    @Override
    public long count() {
        return records.size();
    }
}
