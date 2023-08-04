package com.ra.shop;

import com.ra.shop.data.DataContext;
import com.ra.shop.model.*;

import java.text.MessageFormat;
import java.util.Scanner;

public class ShopCoffe {
    private static Employee currentUser;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataContext dtx = new DataContext("");
        while (true) {
            System.out.println("1. Đăng nhập");
            System.out.println("2. Thoát");
            System.out.print("Tính năng: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Mật khẩu: ");
                    String password = sc.nextLine();
                    Employee emp = dtx.getEmployees().stream()
                            .filter(x -> x.getEmail().equals(email) && x.getPassword().equals(password))
                            .findFirst().orElse(null);
                    if (emp != null) {
                        currentUser = emp;
                        loggedMenu(sc, dtx);
                    } else {
                        System.out.println("Sai tài khoản mật khẩu");
                    }
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sai chức năng!");
                    break;
            }
        }
        /**
         * Sau khi đăng nhập
         * Xin chào [Tên NV đã đăng nhập]
         * 1. Hiển thị danh sách bàn
         * 2. Đặt bàn
         * 3. Thanh toán
         * 4. Đăng xuất
         * */
    }

    public static void loggedMenu(Scanner sc, DataContext dtx) {
        while (currentUser != null) {
            System.out.println("Xin chào " + currentUser.getFullName() + "!");
            System.out.println("1. Check bàn");
            System.out.println("2. Đặt bàn");
            //System.out.println("2. Chuyển bàn(Hiển thị danh sách bàn trống -> Nhập mã bàn -> check bàn trống hay không? -> chuyển orders sang bàn mới -> update trạng thái bàn cũ và mới)");
            System.out.println("3. Thanh toán");
            System.out.println("4. Đăng xuất");
            System.out.print("Chọn chức năng: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("DANH SÁCH BÀN");
                    for (Table t : dtx.getTables()) {
                        System.out.println(MessageFormat.format("[{0} ({1})]", t.getTableId(), (t.isStatus() ? "Trống" : "Đã đặt")));
                    }
                    break;
                case 2:
                    System.out.println("DANH SÁCH BÀN");
                    for (Table t : dtx.getTables()) {
                        if (t.isStatus())
                            System.out.println(MessageFormat.format("[{0} ({1})]", t.getTableId(), (t.isStatus() ? "Trống" : "Đã đặt")));
                    }
                    System.out.println("Nhập mã bàn: ");
                    String tableId = sc.nextLine();
                    Table table = dtx.getTables().stream().filter(x -> x.getTableId().equals(tableId)).findFirst().orElse(null);
                    // Hiển thị menu chọn
                    System.out.println("====== MENU ======");
                    for (Category c : dtx.getCategories()) {
                        if (c.isStatus()) {
                            System.out.println(c.getCategoryName());
                            for (Product p : dtx.getProducts()) {
                                if (p.getCategoryId().equals(c.getCategoryId())) {
                                    System.out.println(MessageFormat.format("\t({0}){1} | {2}", p.getProductId(), p.getProductName(), p.getPrice()));
                                }
                            }
                        }
                    }
                    // Chọn đồ uống
                    while (true) {
                        // List order
                        System.out.println("ORDERS");
                        for (OrderDetail item : table.getOrders()) {
                            System.out.println(MessageFormat.format("{0}\t{1}\t{2}\t{3}\t{4}",
                                    item.getProductId(), item.getProductName(), item.getQuantity(), item.getPrice(), (item.getPrice() * item.getQuantity())));
                        }
                        System.out.println("-----------");
                        System.out.print("Mã đồ uống: ");
                        String proId = sc.nextLine();
                        if (proId.equals("exit"))
                            break;
                        Product pro = dtx.getProducts().stream().filter(x -> x.getProductId().equals(proId)).findFirst().orElse(null);
                        System.out.print("Số lượng: ");
                        int qty = Integer.parseInt(sc.nextLine());
                        OrderDetail itemOrder = new OrderDetail();
                        itemOrder.setProductId(pro.getProductId());
                        itemOrder.setProductName(pro.getProductName());
                        itemOrder.setPrice(pro.getPrice());
                        itemOrder.setQuantity(qty);
                        table.addOrder(itemOrder);
                    }
                    break;
                case 3:
                    // Nhập mã bàn cần thanh toán

                    // Hiển thị orders

                    // Xác nhận thanh toán

                    // Lưu thông tin gồm (Order, OrderDetail)
                    break;
                case 4:
                    currentUser = null;
                    break;
                default:
                    System.out.println("Sai chức năng!");
                    break;
            }
        }
    }
}
