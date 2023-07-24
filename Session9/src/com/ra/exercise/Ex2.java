package com.ra.exercise;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        /***
         * Tạo class Provider gồm:
         *      - String providerId;
         *      - String providerName;
         *      - boolean status;
         * Tạo class Computer gồm:
         *      - String computerId;
         *      - String model;
         *      - double price;
         *      - Provider provider;
         *      - boolean status;
         * Tạo đầy đủ get/set constructor và các phương thức cần thiết cho 2 class trên.
         * Viết chương trình thực hiện các yêu cầu sau:
         * =================== MENU ===================
         *      1. Quản lý nhà cung cấp
         *      2. Quản lý sản phẩm
         *      3. Thoát
         * Khi chọn chức năng 1, vào menu "Quản lý nhà cung cấp":
         * =========== Quản lý nhà cung cấp ===========
         *      1. Thêm nhà cung cấp
         *      2. Hiển thị danh sách nhà cung cấp (sắp xếp theo tên A-Z)
         *      3. Quay lại (quay về "MENU")
         * Khi chọn chức năng 2, vào menu "Quản lý sản phẩm":
         * ============= Quản lý sản phẩm =============
         *      1. Thêm sản phẩm (nhà cung cấp được chọn từ danh sách NCC đã thêm)
         *      2. Hiển thị danh sách sản phẩm theo model A-Z
         *      3. Cập nhật thông tin sản phẩm (tìm sp cập nhật theo mã)
         *      4. Xóa sản phẩm theo mã
         *      5. Quay lại (quay về "MENU")
         */

        Scanner sc = new Scanner(System.in);
        // Khai báo danh sách chứa các nhà cung cấp
        List<Provider> providers = new ArrayList<>();
        // Khai báo danh sách chứa các sản phẩm
        List<Computer> computers = new ArrayList<>();

        while (true) {
            System.out.println("=================== MENU ===================");
            System.out.println("1. Quản lý nhà cung cấp");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng (1-3): ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    providerMain(sc, providers);
                    break;
                case 2:
                    computerMain(sc, providers, computers);
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

    public static void providerMain(Scanner sc, List<Provider> providers) {
        while (true) {
            System.out.println("=========== Quản lý nhà cung cấp ===========");
            System.out.println("1. Thêm nhà cung cấp");
            System.out.println("2. Hiển thị danh sách nhà cung cấp (sắp xếp theo tên A-Z)");
            System.out.println("3. Quay lại");
            System.out.print("Chọn chức năng (1-3): ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 3:
                    return;
                default:
                    System.out.println("Sai chức năng!");
                    break;
            }
        }
    }

    public static void computerMain(Scanner sc, List<Provider> providers, List<Computer> computers) {

        while (true) {
            System.out.println("============= Quản lý sản phẩm =============");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm theo model A-Z");
            System.out.println("3. Cập nhật thông tin sản phẩm");
            System.out.println("4. Xóa sản phẩm theo mã");
            System.out.println("5. Quay lại");
            System.out.print("Chọn chức năng (1-5): ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    Computer c = new Computer();

                    // nhập mã providerId đã thêm

                    // tìm đối tượng provider theo providerId vừa nhập trong list providers

                    // truyền vào đối tượng computer
                    c.setProvider(null);

                    computers.add(c);
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
