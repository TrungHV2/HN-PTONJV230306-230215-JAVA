package com.ra.run;

import com.ra.customearray.MyList;
import com.ra.customearray.MyListImp;
import com.ra.entity.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyList students = new MyListImp();

        while (true) {
            System.out.println("1.	Nhập thông tin n sinh viên");
            System.out.println("2.	Tính điểm trung bình sinh viên");
            System.out.println("3.	Xét điểm qua cho sinh viên");
            System.out.println("4.	Hiển thị thông tin sinh viên");
            System.out.println("5.	Xóa sinh viên");
            System.out.println("6.	Thoát");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.print("Số sinh viên cần nhập: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 1; i <= n; i++) {
                        Student st = new Student();
                        st.inputData();
                        students.add(st);
                    }
                    break;
                case 2:
                    for (int i = 0; i < students.size(); i++) {
                        Student st = (Student) students.get(i);
                        st.calculatorAvg();
                    }
                    break;
                case 3:
                    for (int i = 0; i < students.size(); i++) {
                        Student st = (Student) students.get(i);
                        st.checkPass();
                    }
                    break;
                case 4:
                    for (int i = 0; i < students.size(); i++) {
                        Student st = (Student) students.get(i);
                        st.displayData();
                    }
                    break;
                case 5:
                    System.out.print("Nhập mã sinh viên: ");
                    String stId = sc.nextLine();
                    Object student = students.find(new Student(stId));
                    if (student != null) {
                        students.remove(student);
                    }
                    System.out.println("Xóa hoàn thành!");
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn sai tính năng!");
                    break;
            }
        }
    }
}
