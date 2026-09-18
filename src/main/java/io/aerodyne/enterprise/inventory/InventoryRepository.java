package io.aerodyne.enterprise.inventory;

import io.aerodyne.enterprise.EnterpriseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class InventoryRepository implements EnterpriseRepository<InventoryRecord> {
    private final List<InventoryRecord> records = new ArrayList<>();

    @Override
    public InventoryRecord save(InventoryRecord item) {
        records.add(item);
        return item;
    }

    @Override
    public List<InventoryRecord> findAll() {
        return Collections.unmodifiableList(records);
    }

    @Override
    public long count() {
        return records.size();
    }
}
