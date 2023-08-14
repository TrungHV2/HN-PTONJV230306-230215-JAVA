package com.ra.model;

import com.ra.service.impl.ClassService;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

public class Student implements Serializable, IEntity {
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private Date birthday;
    private boolean gender;
    private int classId;

    public Student() {
    }

    public Student(String id, String name, String email, String phone, String address, Date birthday, boolean gender, int classId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.birthday = birthday;
        this.gender = gender;
        this.classId = classId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    @Override
    public void input(boolean isEdit) {
        ClassService classService = new ClassService();
        Scanner sc = new Scanner(System.in);
        if (!isEdit) {
            System.out.print("Mã sinh viên: ");
            this.setId(sc.nextLine());
        }
        System.out.printf("Tên sinh viên%s: ", (isEdit ? "["+this.name+"]" : ""));
        this.setName(sc.nextLine());
        System.out.print("Email: ");
        this.setEmail(sc.nextLine());
        while (true) {
            System.out.print("Mã lớp: ");
            int classId = Integer.parseInt(sc.nextLine());
            if (classService.find(classId) != null) {
                this.setClassId(classId);
                break;
            }
            System.out.println("Mã lớp không tồn tại!");
        }
    }

    @Override
    public void output() {

    }
}
