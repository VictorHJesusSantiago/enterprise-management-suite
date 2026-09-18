package io.aerodyne.enterprise.maintenance;

import io.aerodyne.enterprise.EnterpriseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class MaintenanceRepository implements EnterpriseRepository<MaintenanceRecord> {
    private final List<MaintenanceRecord> records = new ArrayList<>();

    @Override
    public MaintenanceRecord save(MaintenanceRecord item) {
        records.add(item);
        return item;
    }

    @Override
    public List<MaintenanceRecord> findAll() {
        return Collections.unmodifiableList(records);
    }

    @Override
    public long count() {
        return records.size();
    }
}
