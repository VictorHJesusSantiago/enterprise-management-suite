package io.aerodyne.enterprise.budget;

import io.aerodyne.enterprise.EnterpriseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class BudgetRepository implements EnterpriseRepository<BudgetRecord> {
    private final List<BudgetRecord> records = new ArrayList<>();

    @Override
    public BudgetRecord save(BudgetRecord item) {
        records.add(item);
        return item;
    }

    @Override
    public List<BudgetRecord> findAll() {
        return Collections.unmodifiableList(records);
    }

    @Override
    public long count() {
        return records.size();
    }
}
