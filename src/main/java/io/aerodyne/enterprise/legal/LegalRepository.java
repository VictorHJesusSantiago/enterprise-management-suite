package io.aerodyne.enterprise.legal;

import io.aerodyne.enterprise.EnterpriseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LegalRepository implements EnterpriseRepository<LegalRecord> {
    private final List<LegalRecord> records = new ArrayList<>();

    @Override
    public LegalRecord save(LegalRecord item) {
        records.add(item);
        return item;
    }

    @Override
    public List<LegalRecord> findAll() {
        return Collections.unmodifiableList(records);
    }

    @Override
    public long count() {
        return records.size();
    }
}
