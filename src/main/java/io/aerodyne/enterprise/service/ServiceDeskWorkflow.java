package io.aerodyne.enterprise.service;

public final class ServiceDeskWorkflow {
    public ServiceDeskStatus next(ServiceDeskStatus current, boolean approved) {
        if (current == ServiceDeskStatus.DRAFT) {
            return ServiceDeskStatus.UNDER_REVIEW;
        }
        if (current == ServiceDeskStatus.UNDER_REVIEW && approved) {
            return ServiceDeskStatus.APPROVED;
        }
        if (current == ServiceDeskStatus.APPROVED) {
            return ServiceDeskStatus.POSTED;
        }
        return current;
    }
}
