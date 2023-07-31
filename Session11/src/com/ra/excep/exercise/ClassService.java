package com.ra.excep.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ClassService implements GenericService<Class> {
    @Override
    public List<Class> findAll() {
        return Database.classes;
    }

    @Override
    public List<Class> where(Predicate<Class> predicate) {
        List<Class> result = new ArrayList<>();
        for (Class c : findAll()) {
            if (predicate.test(c))
                result.add(c);
        }
        return result;
    }

    @Override
    public Class findSingle(Predicate<Class> predicate) {
        for (Class c : findAll()) {
            if (predicate.test(c))
                return c;
        }
        return null;
    }

    @Override
    public boolean add(Class item) {
        try {
            Database.classes.add(item);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean edit(Class item) {
        try {
            Class _class = findSingle(c -> c.getId().equals(item.getId()));
            if (_class != null) {
                _class.setName(item.getName());
                return true;
            }
            return false;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean remove(Class item) {
        try {
            Database.classes.remove(item);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
