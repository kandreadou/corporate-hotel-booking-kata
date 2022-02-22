package com.codurance.repository;

import java.util.List;

public interface Repository<T> {

    void save(String id, T t);

    T get(String id);

    void delete(String id);

    List<T> getAll();

    boolean exists(String id);

    int count();
}
