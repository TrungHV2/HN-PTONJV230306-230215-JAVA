package com.ra.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CategoryService {
    private DataContext context;

    public CategoryService(DataContext context) {
        this.context = context;
    }

    public List<Category> findAll() {
        return context.getCategories();
    }
    public List<Category> findAll(Predicate<Category> predicate) {
        List<Category> result = new ArrayList<>();
        for (Category c : context.getCategories())
            if (predicate.test(c))
                result.add(c);
        return result;
    }
    public Category find(String id) {
        for (Category c : context.getCategories())
            if (c.getId().equals(id))
                return c;
        return null;
    }
    public Category find(Predicate<Category> predicate) {
        for (Category c : context.getCategories())
            if (predicate.test(c))
                return c;
        return null;
    }
    public boolean add(Category c) {
        try {
            context.getCategories().add(c);
            context.save();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
    public boolean edit(Category c) {
        try {
            Category cat = find(c.getId());
            if (cat != null) {
                cat.setName(c.getName());
                cat.setStatus(c.isStatus());
                context.save();
                return true;
            }
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
    public boolean remove(String id) {
        try {
            Category cat = find(id);
            if (cat != null) {
                context.getCategories().remove(cat);
                context.save();
                return true;
            }
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
    public boolean remove(Category c) {
        try {
            Category cat = find(c.getId());
            if (cat != null) {
                context.getCategories().remove(cat);
                context.save();
                return true;
            }
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
