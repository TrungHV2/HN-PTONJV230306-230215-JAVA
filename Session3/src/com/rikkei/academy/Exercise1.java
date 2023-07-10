package com.rikkei.academy;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        /**
         * Viết chương trình Java, cho phép nhập tên 5 học viên trong lớp, lưu trữ vào mảng students.
         * Sắp xếp danh sách tên các học viên theo bảng chữ cái A-Z
         * */
        // Khởi tạo đối tượng nhập
        Scanner sc = new Scanner(System.in);
        // Khai báo mảng
        String[] students = new String[5];
        // Nhập tên cho 5 học viên
        for (int i = 0; i < students.length; i++) {
            System.out.print("Nhập tên học viên thứ " + (i+1) + ": ");
            students[i] = sc.nextLine();
        }
        // Sắp xếp
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].compareTo(students[j]) > 0) {
                    String temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        // Hiển thị mảng
        System.out.println(Arrays.toString(students));
    }
}
