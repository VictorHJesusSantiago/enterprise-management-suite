package io.aerodyne.enterprise.invoices;

import io.aerodyne.enterprise.EnterpriseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class InvoicesRepository implements EnterpriseRepository<InvoicesRecord> {
    private final List<InvoicesRecord> records = new ArrayList<>();

    @Override
    public InvoicesRecord save(InvoicesRecord item) {
        records.add(item);
        return item;
    }

    @Override
    public List<InvoicesRecord> findAll() {
        return Collections.unmodifiableList(records);
    }

    @Override
    public long count() {
        return records.size();
    }
}
