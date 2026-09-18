package io.aerodyne.enterprise.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public final class ServiceDeskService {
    private final ServiceDeskRepository repository;
    private final ServiceDeskValidator validator = new ServiceDeskValidator();

    public ServiceDeskService(ServiceDeskRepository repository) {
        this.repository = repository;
    }

    public ServiceDeskRecord open(String id, String title, String owner, BigDecimal amount, LocalDate dueDate) {
        ServiceDeskRecord record = new ServiceDeskRecord(id, title, owner, amount, dueDate, ServiceDeskStatus.UNDER_REVIEW, io.aerodyne.enterprise.PriorityLevel.NORMAL);
        validator.requireValid(record);
        return repository.save(record);
    }

    public List<ServiceDeskRecord> list() {
        return repository.findAll();
    }
}
