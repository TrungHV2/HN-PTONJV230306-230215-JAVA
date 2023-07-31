package com.ra.excep.exercise;

import java.text.MessageFormat;
import java.util.Scanner;

public class Class {
    // Không bỏ trống,bắt đầu bằng "C", 3 kí tự
    private String id;
    // Không bỏ trống, IN HOA, từ 12-16 kí tự
    private String name;
    private StudentService service;

    public Class(StudentService service) {
        this.service = service;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws Exception {
        if (id == null || id.length() == 0)
            throw new Exception("Mã lớp không được bỏ trống!");
        if (!id.startsWith("C") || id.length() != 3)
            throw new Exception("Mã lớp bắt đầu bằng \"C\", độ dài 3 kí tự!");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name == null)
            throw new Exception("Tên lớp không bỏ trống!");
        if (!name.matches("^[A-Z\\d]+$"))
            throw new Exception("Tên lớp phải viết IN HOA!");
        this.name = name;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhập mã lớp: ");
                setId(sc.nextLine());
                break;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Nhập tên lớp: ");
                setName(sc.nextLine());
                break;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("__________");
    }

    public void output() {
        int total = service.where(st -> st.getClassId().equals(this.id)).size();
        System.out.println(MessageFormat.format("Mã lớp: {0} | Tên lớp: {1} | Số sinh viên: {2}", this.id, this.name, total));
        System.out.println("_________");
    }
}
