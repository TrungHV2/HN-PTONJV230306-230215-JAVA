package com.rikkei.academy.exercise;

import java.text.MessageFormat;
import java.util.Scanner;

public class Person {
    private String fullName;
    private boolean gender;
    private String address;

    public Person() {
    }

    public Person(String fullName, boolean gender, String address) {
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
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

    public void input(Scanner sc) {
        System.out.print("Nhập họ tên: ");
        fullName = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        gender = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Nhập địa chỉ: ");
        address = sc.nextLine();
    }

    @Override
    public String toString() {
        return MessageFormat.format("Họ và tên: %s\nGiới tính: %s\n Địa chỉ: %s\n", fullName, gender, address);
    }
}
