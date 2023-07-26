package com.ra.exercise.service;

import com.ra.exercise.Provider;

import java.util.ArrayList;
import java.util.List;

public class ProviderServiceImpl implements ProviderService {
    private List<Provider> providers;

    public ProviderServiceImpl() {
        providers = new ArrayList<>();
    }

    @Override
    public List<Provider> findAll() {
        return this.providers;
    }

    @Override
    public Provider findId(String id) {
        return providers.stream().filter(x -> x.getProviderId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void add(Provider p) {
        this.providers.add(p);
    }

    @Override
    public List<Provider> findOrderByProviderName() {
        providers.sort((p1, p2) -> p1.getProviderName().compareTo(p1.getProviderName()));
        return this.providers;
    }
}
