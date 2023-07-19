package com.ra.customearray;

public interface MyList {
    int MIN_CAPACITY = 10;
    String[] INIT_DEFAULT = {};

    void add(Object item);
    void remove(Object item);
    Object get(int index);
    Object find(Object item);
    int findIndex(Object item);
    boolean contains(Object str);
    int size();
}
