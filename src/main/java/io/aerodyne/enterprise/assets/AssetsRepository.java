package io.aerodyne.enterprise.assets;

import io.aerodyne.enterprise.EnterpriseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class AssetsRepository implements EnterpriseRepository<AssetsRecord> {
    private final List<AssetsRecord> records = new ArrayList<>();

    @Override
    public AssetsRecord save(AssetsRecord item) {
        records.add(item);
        return item;
    }

    @Override
    public List<AssetsRecord> findAll() {
        return Collections.unmodifiableList(records);
    }

    @Override
    public long count() {
        return records.size();
    }
}
