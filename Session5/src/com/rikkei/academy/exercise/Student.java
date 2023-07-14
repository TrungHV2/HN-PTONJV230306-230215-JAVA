package com.rikkei.academy.exercise;

import java.text.MessageFormat;
import java.util.Scanner;

public class Student extends Person{
    private String schoolName;

    public Student() {

    }

    public Student(String fullName, boolean gender, String address, String schoolName) {
        super(fullName, gender, address);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("Nhập tên trường: ");
        schoolName = sc.nextLine();
    }

    @Override
    public String toString() {
        return MessageFormat.format("%sTrường: %s\n", super.toString(), schoolName);
    }
}
