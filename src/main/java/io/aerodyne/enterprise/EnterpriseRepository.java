package io.aerodyne.enterprise;

import java.util.List;

public interface EnterpriseRepository<T> {
    T save(T item);
    List<T> findAll();
    long count();
}
