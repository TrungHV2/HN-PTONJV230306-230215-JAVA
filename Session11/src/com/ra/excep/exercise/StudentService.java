package com.ra.excep.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StudentService implements GenericService<Student> {
    @Override
    public List<Student> findAll() {
        return Database.students;
    }

    @Override
    public List<Student> where(Predicate<Student> predicate) {
        List<Student> result = new ArrayList<>();
        for (Student c : findAll()) {
            if (predicate.test(c))
                result.add(c);
        }
        return result;
    }

    @Override
    public Student findSingle(Predicate<Student> predicate) {
        return null;
    }

    @Override
    public boolean add(Student item) {
        return false;
    }

    @Override
    public boolean edit(Student item) {
        return false;
    }

    @Override
    public boolean remove(Student item) {
        return false;
    }
}
