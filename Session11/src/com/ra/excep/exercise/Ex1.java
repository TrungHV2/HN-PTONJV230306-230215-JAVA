package com.ra.excep.exercise;

public class Ex1 {
    public static void main(String[] args) {
        /**
         * Tạo class Class
         *      // Không bỏ trống,bắt đầu bằng "C", 3 kí tự
         *      private String id;
         *      // Không bỏ trống, IN HOA, từ 12-16 kí tự
         *      private String name;
         * Tạo class Student
         *     // Không bỏ trống,bắt đầu bằng SV, tối đa 4 kí tự
         *     private String id;
         *     // Không bỏ trống, viết IN HOA không dấu
         *     private String name;
         *     // Không bỏ trống, đúng định dạng email
         *     private String email;
         *     // Không bỏ trống,đúng định dạng SĐT
         *     private String phone;
         *     // Không bỏ trống, phải tồn tại trong list classes đã lưu
         *     private String classId;
         *     // Không bỏ trống, phải nhập true/false
         *     private boolean status;
         * Viết chương trình Java thực hiện các menu chức năng sau:
         *      1. Quản lý lớp
         *      2. Quản lý sinh viên
         *      3. Thoát
         * ============ Quản lý lớp ============
         *      1. Thêm lớp
         *      2. Sửa lớp
         *      3. Xóa lớp (Không xóa lớp có sinh viên)
         *      4. Xem danh sách lớp sắp xếp theo tên A-Z (gồm Mã lớp, Tên lớp, Tổng số sv)
         *      5. Quay lại
         * ========= Quản lý sinh viên =========
         *      1. Thêm sinh viên
         *      2. Sửa sinh viên
         *      3. Tìm kiếm sinh viên theo tên lớp hoặc tên sinh viên (1 trong 2 điều kiện)
         *      4. Quay lại
         * */


        ClassService classService = new ClassService();
        StudentService studentService = new StudentService();

        Class newClass = new Class(studentService);
        newClass.input();

        classService.add(newClass);
        Class newClass1 = new Class(studentService);
        newClass1.input();

        classService.add(newClass1);

        for (Class c : classService.findAll()) {
            c.output();
        }
    }
}
