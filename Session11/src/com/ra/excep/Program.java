package com.ra.excep;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        try {
            // Các câu lệnh có khả năng xảy ra lỗi
            System.out.print("Nhập số nguyên n = ");
            n = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException ex) {
            // Khối lệnh xử lý khi lỗi xảy ra
            System.out.println("Nhập sai định dạng số! " + ex.getMessage());
            n = 0;
        } catch (Exception ex) {
            // Khối lệnh xử lý khi lỗi xảy ra
            System.out.println("Có lỗi xảy ra: " + ex.getMessage());
            n = 0;
        } finally {
            System.out.println("Luôn thực thi dù có lỗi hay không");
        }


        System.out.println("n = " + n);

        Student st = new Student();
        while (true) {
            try {
                System.out.print("Nhập mã sinh viên: ");
                st.setId(sc.nextLine());
                break;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("Mã sinh viên: " + st.getId());
    }
}
