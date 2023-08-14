package com.ra.service.impl;

import com.ra.model.Class;
import com.ra.service.GenericService;
import com.ra.storage.DataContext;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ClassService implements GenericService<Class, Integer> {
    private DataContext db;

    public ClassService(DataContext db) {
        this.db = db;
    }

    public ClassService() {
        this.db = new DataContext();
    }

    @Override
    public List<Class> findAll() {
        return db.getClasses();
    }

    @Override
    public List<Class> findAll(Predicate<Class> predicate) {
        return db.getClasses().stream()
                .filter(predicate).collect(Collectors.toList());
    }

    @Override
    public Class find(Integer id) {
        return db.getClasses().stream()
                .filter(c -> c.getId() == id)
                .findFirst().orElse(null);
    }

    @Override
    public Class find(Predicate<Class> predicate) {
        return db.getClasses().stream()
                .filter(predicate)
                .findFirst().orElse(null);
    }

    @Override
    public boolean add(Class item) {
        try {
            db.getClasses().add(item);
            db.save();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean edit(Class item) {
        try {
            Class _class = find(item.getId());
            _class.setName(item.getName());
            _class.setStatus(item.isStatus());
            db.save();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean remove(Class item) {
        try {
            db.getClasses().remove(item);
            db.save();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean removeId(Integer id) {
        try {
            Class _class = find(id);
            db.getClasses().remove(_class);
            db.save();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
