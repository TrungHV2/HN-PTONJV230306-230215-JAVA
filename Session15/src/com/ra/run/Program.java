package com.ra.run;

import com.ra.model.Class;
import com.ra.model.Student;
import com.ra.service.impl.ClassService;
import com.ra.service.impl.StudentService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Quản lý lớp");
            System.out.println("2. Quản lý sinh viên");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    classesMenu(sc);
                    break;
                case 2:
                    studentsMenu(sc);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sai chức năng!");
                    break;
            }
        }
    }

    public static void classesMenu(Scanner sc) {
        ClassService classService = new ClassService();
        while (true) {
            System.out.println("1. Thêm lớp");
            System.out.println("2. Cập nhật lớp");
            System.out.println("3. Xóa lớp");
            System.out.println("4. Tìm kiếm lớp");
            System.out.println("5. Quay lại");
            System.out.print("Chọn chức năng: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    Class _class = new Class();
                    _class.input(false);
                    // Thêm vào list
                    classService.add(_class);
                    break;
                case 2:
                    System.out.print("Mã lớp cần cập nhật: ");
                    Class _initUpdate = classService.find(Integer.parseInt(sc.nextLine()));
                    if (_initUpdate != null) {
//                        System.out.print("Tên lớp [\""+_initUpdate.getName()+"\"]: ");
//                        _initUpdate.setName(sc.nextLine());
//                        System.out.print("Trạng thái [\""+_initUpdate.isStatus()+"\"]: ");
//                        _initUpdate.setStatus(Boolean.parseBoolean(sc.nextLine()));
                        _initUpdate.input(true);
                        classService.edit(_initUpdate);
                        System.out.println("Cập nhật thành công!");
                    } else {
                        System.out.println("Mã lớp không tồn tại!");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    for (Class c : classService.findAll()) {
                        System.out.println(c.getId() + " | " + c.getName());
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Sai chức năng!");
                    break;
            }
        }
    }

    public static void studentsMenu(Scanner sc) {
        StudentService service = new StudentService();
        ClassService classService = new ClassService();
        while (true) {
            System.out.println("1. Thêm mới ");
            System.out.println("2. Cập nhật");
            System.out.println("3. Xóa");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Quay lại");
            System.out.print("Chọn chức năng: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    Student st = new Student();
                    st.input(false);
                    // Thêm vào list
                    service.add(st);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    for (Student s : service.findAll()) {
                        Class _class = classService.find(s.getClassId());
                        System.out.println(s.getName() + "|" + _class.getName());
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Sai chức năng!");
                    break;
            }
        }
    }
}
