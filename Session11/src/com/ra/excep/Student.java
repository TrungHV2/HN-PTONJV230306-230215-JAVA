package com.ra.excep;

public class Student {
    // Không bỏ trống,bắt đầu bằng SV, tối đa 4 kí tự
    private String id;
    // Không bỏ trống, viết IN HOA không dấu
    private String name;
    // Không bỏ trống, đúng định dạng email
    private String email;
    // Không bỏ trống,đúng định dạng SĐT
    private String phone;
    // Không bỏ trống, phải nhập true/false
    private boolean status;

    public Student() {
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws Exception {
        if (id == null || id.equals(""))
            throw new IdNullException();
        if (!id.startsWith("SV"))
            throw new Exception("Mã sinh viên phải bắt đầu bằng \"SV\"");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
