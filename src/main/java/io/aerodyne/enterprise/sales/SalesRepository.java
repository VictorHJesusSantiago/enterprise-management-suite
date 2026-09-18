package io.aerodyne.enterprise.sales;

import io.aerodyne.enterprise.EnterpriseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SalesRepository implements EnterpriseRepository<SalesRecord> {
    private final List<SalesRecord> records = new ArrayList<>();

    @Override
    public SalesRecord save(SalesRecord item) {
        records.add(item);
        return item;
    }

    @Override
    public List<SalesRecord> findAll() {
        return Collections.unmodifiableList(records);
    }

    @Override
    public long count() {
        return records.size();
    }
}
