package com.ra.exercise.service;

import com.ra.exercise.Computer;

import java.util.List;

public interface ComputerService {
    List<Computer> findAll();
    List<Computer> findOrderByModel();
    Computer findId(String id);
    void add(Computer c);
    void edit(Computer c);
    void remove(String id);
}
