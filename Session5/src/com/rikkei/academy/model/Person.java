package com.rikkei.academy.model;

public class Person {
    protected String fullName;
    protected boolean gender;
    protected String address;
    protected String email;

    public Person() {
    }

    public Person(String fullName, boolean gender, String address, String email) {
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void output() {
        System.out.println("Họ tên: " + this.fullName);
        System.out.println("Giới tính: " + (this.gender ? "Nam" : "Nữ"));
        System.out.println("Địa chỉ: " + this.address);
        System.out.println("Email: " + this.email);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
