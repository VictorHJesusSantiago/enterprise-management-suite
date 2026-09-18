package io.aerodyne.enterprise.tax;

import io.aerodyne.enterprise.EnterpriseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class TaxRepository implements EnterpriseRepository<TaxRecord> {
    private final List<TaxRecord> records = new ArrayList<>();

    @Override
    public TaxRecord save(TaxRecord item) {
        records.add(item);
        return item;
    }

    @Override
    public List<TaxRecord> findAll() {
        return Collections.unmodifiableList(records);
    }

    @Override
    public long count() {
        return records.size();
    }
}
