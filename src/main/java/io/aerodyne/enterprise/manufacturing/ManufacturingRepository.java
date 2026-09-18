package io.aerodyne.enterprise.manufacturing;

import io.aerodyne.enterprise.EnterpriseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ManufacturingRepository implements EnterpriseRepository<ManufacturingRecord> {
    private final List<ManufacturingRecord> records = new ArrayList<>();

    @Override
    public ManufacturingRecord save(ManufacturingRecord item) {
        records.add(item);
        return item;
    }

    @Override
    public List<ManufacturingRecord> findAll() {
        return Collections.unmodifiableList(records);
    }

    @Override
    public long count() {
        return records.size();
    }
}
