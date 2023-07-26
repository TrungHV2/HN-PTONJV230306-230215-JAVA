package com.ra.exercise.service;

import com.ra.exercise.Provider;

import java.util.List;

public interface ProviderService {
    List<Provider> findAll();
    Provider findId(String id);
    void add(Provider p);
    List<Provider> findOrderByProviderName();
}
