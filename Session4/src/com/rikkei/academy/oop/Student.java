package com.rikkei.academy.oop;

public class Student {
    // Thuộc tính/Field
    private String fullName;
    private String email;
    private String address;

    // Hàm khởi tạo (constructor)
    public Student() {
    }

    public Student(String fullName) {
        this.fullName = fullName;
    }

    public Student(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    public Student(String fullName, String email, String address) {
        this.fullName = fullName;
        this.email = email;
        this.address = address;
    }

    // Phương thức getter/setter
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Hành vi của đối tượng (Method)
    void hello() {
        test();
        System.out.println("Student hello!");
    }

    public static void test() {
        System.out.println("Static method");
    }
}
