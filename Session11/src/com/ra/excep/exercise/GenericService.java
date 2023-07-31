package com.ra.excep.exercise;

import java.util.List;
import java.util.function.Predicate;

public interface GenericService <T> {
    List<T> findAll();
    List<T> where(Predicate<T> predicate);
    T findSingle(Predicate<T> predicate);
    boolean add(T item);
    boolean edit(T item);
    boolean remove(T item);
}
