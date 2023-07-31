package com.ra.excep.exercise;

public class Student {
    // Không bỏ trống,bắt đầu bằng SV, tối đa 4 kí tự
    private String id;
    // Không bỏ trống, viết IN HOA không dấu
    private String name;
    // Không bỏ trống, đúng định dạng email
    private String email;
    // Không bỏ trống,đúng định dạng SĐT
    private String phone;
    // Không bỏ trống, phải tồn tại trong list classes đã lưu
    private String classId;
    // Không bỏ trống, phải nhập true/false
    private boolean status;

    public Student() {
    }

    public Student(String id, String name, String email, String phone, String classId, boolean status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.classId = classId;
        this.status = status;
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

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
