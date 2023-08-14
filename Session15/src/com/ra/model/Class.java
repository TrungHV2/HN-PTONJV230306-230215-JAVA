package com.ra.model;

import com.ra.service.impl.ClassService;

import java.io.Serializable;
import java.util.Scanner;

public class Class implements Serializable, IEntity {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private boolean status;

    public Class(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Class() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void input(boolean isEdit) {
        ClassService service = new ClassService();
        Scanner sc = new Scanner(System.in);
        if (!isEdit) {
            while (true) {
                System.out.print("Mã lớp: ");
                int id = Integer.parseInt(sc.nextLine());
                if (service.find(id) == null) {
                    this.setId(id);
                    break;
                }
                System.out.println("Mã lớp đã tồn tại!");
            }
        }
        System.out.printf("Tên lớp%s: ", (isEdit ? " ["+this.name+"]": ""));
        this.setName(sc.nextLine());
        System.out.printf("Trạng thái: ", (isEdit ? " ["+this.status+"]": ""));
        this.setStatus(Boolean.parseBoolean(sc.nextLine()));
    }

    @Override
    public void output() {

    }
}
