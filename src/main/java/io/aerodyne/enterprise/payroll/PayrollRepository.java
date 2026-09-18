package io.aerodyne.enterprise.payroll;

import io.aerodyne.enterprise.EnterpriseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PayrollRepository implements EnterpriseRepository<PayrollRecord> {
    private final List<PayrollRecord> records = new ArrayList<>();

    @Override
    public PayrollRecord save(PayrollRecord item) {
        records.add(item);
        return item;
    }

    @Override
    public List<PayrollRecord> findAll() {
        return Collections.unmodifiableList(records);
    }

    @Override
    public long count() {
        return records.size();
    }
}
