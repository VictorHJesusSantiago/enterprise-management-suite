package io.aerodyne.enterprise.service;

import io.aerodyne.enterprise.EnterpriseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ServiceDeskRepository implements EnterpriseRepository<ServiceDeskRecord> {
    private final List<ServiceDeskRecord> records = new ArrayList<>();

    @Override
    public ServiceDeskRecord save(ServiceDeskRecord item) {
        records.add(item);
        return item;
    }

    @Override
    public List<ServiceDeskRecord> findAll() {
        return Collections.unmodifiableList(records);
    }

    @Override
    public long count() {
        return records.size();
    }
}
