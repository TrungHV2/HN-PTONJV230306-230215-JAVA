package com.ra.shop.service;

import com.ra.shop.util.Predicate;

import java.util.List;

public interface GenericService<T, K> {
    List<T> findAll();
    List<T> findBy(Predicate<T> predicate);
    T findId(K id);
    void add(T item);
    void edit(T item);
    void remove(K id);
}
