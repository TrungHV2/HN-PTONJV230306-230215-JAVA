package com.ra.exercise;

import com.ra.exercise.service.ComputerService;
import com.ra.exercise.service.ComputerServiceImpl;
import com.ra.exercise.service.ProviderService;
import com.ra.exercise.service.ProviderServiceImpl;

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
        ProviderService ps = new ProviderServiceImpl();
        ComputerService cs = new ComputerServiceImpl();

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
                    providerMain(sc, ps);
                    break;
                case 2:
                    computerMain(sc, ps, cs);
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

    public static void providerMain(Scanner sc, ProviderService ps) {
        while (true) {
            System.out.println("=========== Quản lý nhà cung cấp ===========");
            System.out.println("1. Thêm nhà cung cấp");
            System.out.println("2. Hiển thị danh sách nhà cung cấp (sắp xếp theo tên A-Z)");
            System.out.println("3. Quay lại");
            System.out.print("Chọn chức năng (1-3): ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.print("Nhập số NCC cần thêm: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        Provider p = new Provider();
                        System.out.print("Nhập mã ncc: ");
                        p.setProviderId(sc.nextLine());
                        System.out.print("Nhập tên ncc: ");
                        p.setProviderName(sc.nextLine());
                        System.out.print("Trạng thái (true/false): ");
                        p.setStatus(Boolean.parseBoolean(sc.nextLine()));
                        System.out.println("++++++++");
                        ps.add(p);
                    }
                    break;
                case 2:
                    System.out.println("Danh sách NCC sắp xếp theo tên A-Z");
//                    providers.sort(new Comparator<Provider>() {
//                        @Override
//                        public int compare(Provider o1, Provider o2) {
//                            return o1.getProviderName().compareTo(o2.getProviderName());
//                        }
//                    });
                    //providers.sort((o1, o2) -> o1.getProviderName().compareTo(o2.getProviderName()));
                    for (Provider item : ps.findOrderByProviderName()) {
                        System.out.println(item.getProviderName());
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Sai chức năng!");
                    break;
            }
        }
    }

    public static void computerMain(Scanner sc, ProviderService ps, ComputerService cs) {

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
                    System.out.print("Mã sản phẩm: ");
                    c.setComputerId(sc.nextLine());
                    System.out.print("Model: ");
                    c.setModel(sc.nextLine());
                    System.out.print("Giá: ");
                    c.setPrice(Double.parseDouble(sc.nextLine()));

                    System.out.print("Nhà cung cấp: ");
                    // nhập mã providerId đã thêm
                    String providerId = sc.nextLine();
                    // tìm đối tượng provider theo providerId vừa nhập trong list providers
                    Provider _provider = ps.findId(providerId);
                    // truyền vào đối tượng computer
                    c.setProvider(_provider);

                    System.out.print("Trạng thái (true/false): ");
                    c.setStatus(Boolean.parseBoolean(sc.nextLine()));
                    cs.add(c);
                    break;
                case 2:
                    System.out.println("Danh sách sản phẩm hiển thị theo Model A-Z");
                    //computers.sort((o1,o2) -> o1.getModel().compareTo(o2.getModel()));
                    for (Computer item : cs.findOrderByModel()) {
                        System.out.printf("Tên sp: %s | NCC: %s\n", item.getModel(), item.getProvider().getProviderName());
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
