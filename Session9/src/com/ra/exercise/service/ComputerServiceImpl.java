package com.ra.exercise.service;

import com.ra.exercise.Computer;

import java.util.ArrayList;
import java.util.List;

public class ComputerServiceImpl implements ComputerService{
    private List<Computer> computers;

    public ComputerServiceImpl() {
        this.computers = new ArrayList<>();
    }

    @Override
    public List<Computer> findAll() {
        return this.computers;
    }

    @Override
    public List<Computer> findOrderByModel() {
        this.computers.sort((c1, c2) -> c1.getModel().compareTo(c2.getModel()));
        return this.computers;
    }

    @Override
    public Computer findId(String id) {
        return this.computers.stream().filter(x -> x.getComputerId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void add(Computer c) {
        this.computers.add(c);
    }

    @Override
    public void edit(Computer c) {
        Computer comp = findId(c.getComputerId());
        // Update
        comp.setModel(c.getModel());
        comp.setPrice(c.getPrice());
        comp.setProvider(c.getProvider());
        comp.setStatus(c.isStatus());
    }

    @Override
    public void remove(String id) {
        Computer computer = findId(id);
        this.computers.remove(computer);
    }
}
