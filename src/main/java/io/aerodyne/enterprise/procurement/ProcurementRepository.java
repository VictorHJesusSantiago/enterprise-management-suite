package io.aerodyne.enterprise.procurement;

import io.aerodyne.enterprise.EnterpriseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ProcurementRepository implements EnterpriseRepository<ProcurementRecord> {
    private final List<ProcurementRecord> records = new ArrayList<>();

    @Override
    public ProcurementRecord save(ProcurementRecord item) {
        records.add(item);
        return item;
    }

    @Override
    public List<ProcurementRecord> findAll() {
        return Collections.unmodifiableList(records);
    }

    @Override
    public long count() {
        return records.size();
    }
}
