package com.ra.exercise;

import com.ra.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataContext implements Serializable {
    private List<Category> categories;
    private List<Product> products;
    // Đường dẫn file lưu danh sách categories
    transient private String contextPath;

    public DataContext(String contextPath) {
        this.contextPath = contextPath;
        readObject();
    }

    public List<Category> getCategories() {
        return this.categories;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void save() throws Exception {
        try {
            FileOutputStream fos = new FileOutputStream(contextPath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.close();
        } catch (Exception ex) {
            throw ex;
        }
    }

    private void readObject() {
        try {
            FileInputStream fos = new FileInputStream(contextPath);
            ObjectInputStream oos = new ObjectInputStream(fos);
            DataContext data = (DataContext)oos.readObject();
            oos.close();
            this.categories = data.getCategories();
            this.products = data.getProducts();
        } catch (Exception ex) {
            this.categories = new ArrayList<>();
            this.products = new ArrayList<>();
            //ex.printStackTrace();
        }
    }
}
