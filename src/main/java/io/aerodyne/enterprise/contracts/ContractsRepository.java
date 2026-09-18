package io.aerodyne.enterprise.contracts;

import io.aerodyne.enterprise.EnterpriseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ContractsRepository implements EnterpriseRepository<ContractsRecord> {
    private final List<ContractsRecord> records = new ArrayList<>();

    @Override
    public ContractsRecord save(ContractsRecord item) {
        records.add(item);
        return item;
    }

    @Override
    public List<ContractsRecord> findAll() {
        return Collections.unmodifiableList(records);
    }

    @Override
    public long count() {
        return records.size();
    }
}
