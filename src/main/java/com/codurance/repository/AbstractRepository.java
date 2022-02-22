package com.codurance.repository;

import java.util.*;

public abstract class AbstractRepository<T> implements Repository<T> {

    private Map<String, T> data = new HashMap<>();

    @Override
    public void save(String id, T t) {
        data.put(id, t);
    }

    @Override
    public T get(String id) {
        return data.get(id);
    }

    @Override
    public void delete(String id) {
        data.remove(id);
    }

    @Override
    public List<T> getAll() {
        return (List<T>) Arrays.asList(data.values().toArray());
    }

    @Override
    public boolean exists(String id) {
        return data.containsKey(id);
    }
}
