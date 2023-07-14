package com.rikkei.academy.model;

public class Student extends Person {
    private String studentId;
    private String className;

    public Student() {
    }

    public Student(String studentId, String fullName, boolean gender, String address, String email, String className) {
        super(fullName, gender, address, email);
        this.studentId = studentId;
        this.className = className;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public void output() {
        System.out.println("Mã sinh viên: " + this.studentId);
        super.output();
        System.out.println("Lớp: " + this.className);
    }
    /**
     * Nạp chồng phương thức
     * ĐK: Cùng tên phương thức
     *     Khác tham số (số lượng/kiểu dữ liệu)
     * */
    public void output(String param) {
        System.out.println("method overloading");
    }
    public void output(int param) {
        System.out.println("method overloading");
    }
    public double output(double param) {
        System.out.println("method overloading");
        return param;
    }
}
