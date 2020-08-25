package com.rappi.tests.repositories;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class RepositoryStructure<T> {
    protected final Map<String, T> objectsMap;

    public RepositoryStructure() {
        this.objectsMap = new HashMap<>();
    }

    public void showAll() {
        System.out.println();
        AtomicInteger rowCount = new AtomicInteger(1);
        objectsMap.forEach((key, value) -> {
            System.out.println(rowCount.getAndIncrement() + " -> " + value.toString());
        });
        System.out.println();
    }

    public T findById(String id) {
        return this.objectsMap.get(id);
    }

    public T delete(String id) {
        return this.objectsMap.remove(id);
    }

    public abstract void add(T object);
}
