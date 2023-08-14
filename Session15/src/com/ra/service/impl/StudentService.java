package com.ra.service.impl;

import com.ra.model.Student;
import com.ra.service.GenericService;
import com.ra.storage.DataContext;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentService implements GenericService<Student, String> {
    private DataContext db;

    public StudentService() {
        this.db = new DataContext();
    }

    public StudentService(DataContext db) {
        this.db = db;
    }

    @Override
    public List<Student> findAll() {
        return db.getStudents();
    }

    @Override
    public List<Student> findAll(Predicate<Student> predicate) {
        return db.getStudents().stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    @Override
    public Student find(String id) {
        return db.getStudents().stream()
                .filter(s -> s.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public Student find(Predicate<Student> predicate) {
        return db.getStudents().stream()
                .filter(predicate)
                .findFirst().orElse(null);
    }

    @Override
    public boolean add(Student item) {
        try {
            db.getStudents().add(item);
            db.save();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean edit(Student item) {
        try {
            Student st = find(item.getId());
            st.setName(item.getName());
            st.setEmail(item.getEmail());
            st.setAddress(item.getAddress());
            st.setBirthday(item.getBirthday());
            st.setGender(item.isGender());
            st.setClassId(item.getClassId());
            st.setPhone(item.getPhone());
            db.save();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean remove(Student item) {
        try {
            db.getStudents().remove(item);
            db.save();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean removeId(String id) {
        try {
            Student item = find(id);
            db.getStudents().remove(item);
            db.save();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
