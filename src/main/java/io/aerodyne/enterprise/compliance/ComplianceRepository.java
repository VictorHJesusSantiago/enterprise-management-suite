package io.aerodyne.enterprise.compliance;

import io.aerodyne.enterprise.EnterpriseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ComplianceRepository implements EnterpriseRepository<ComplianceRecord> {
    private final List<ComplianceRecord> records = new ArrayList<>();

    @Override
    public ComplianceRecord save(ComplianceRecord item) {
        records.add(item);
        return item;
    }

    @Override
    public List<ComplianceRecord> findAll() {
        return Collections.unmodifiableList(records);
    }

    @Override
    public long count() {
        return records.size();
    }
}
