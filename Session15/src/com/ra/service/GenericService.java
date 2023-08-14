package com.ra.service;

import java.util.List;
import java.util.function.Predicate;

public interface GenericService<T, K> {
    List<T> findAll();
    List<T> findAll(Predicate<T> predicate);
    T find(K id);
    T find(Predicate<T> predicate);
    boolean add(T item);
    boolean edit(T item);
    boolean remove(T item);
    boolean removeId(K id);
}
