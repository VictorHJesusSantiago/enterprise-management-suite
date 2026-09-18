package io.aerodyne.enterprise.finance;

import io.aerodyne.enterprise.EnterpriseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class FinanceRepository implements EnterpriseRepository<FinanceRecord> {
    private final List<FinanceRecord> records = new ArrayList<>();

    @Override
    public FinanceRecord save(FinanceRecord item) {
        records.add(item);
        return item;
    }

    @Override
    public List<FinanceRecord> findAll() {
        return Collections.unmodifiableList(records);
    }

    @Override
    public long count() {
        return records.size();
    }
}
