package com.ra.shop;

import com.ra.shop.model.Order;
import com.ra.shop.model.OrderDetail;
import com.ra.shop.model.Product;
import com.ra.shop.service.GenericService;
import com.ra.shop.service.impl.OrderDetailServiceImpl;
import com.ra.shop.service.impl.OrderServiceImpl;
import com.ra.shop.service.impl.ProductServiceImpl;

import java.text.MessageFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        /**
         * Tạo class Product gồm
         *      String productId;
         *      String productName;
         *      double price;
         *      int quantity;
         *      boolean status;
         * Tạo class Order gồm:
         *      String orderId;
         *      String customerName;
         *      String phone;
         *      Date created;
         * Tạo class OrderDetail gồm
         *      String orderId;
         *      String productId;
         *      double price;
         *      int quantity;
         * Viết chương trình java thực hiện các chức năng mua hàng
         *      1. Mua hàng (Cung cấp mã sp và số lượng để thêm vào giỏ hàng)
         *      2. Xem giỏ hàng (Hiển thị danh sách các sản phẩm đã mua)
         *      3. Thanh toán (Cung cấp các thông tin về tên KH, SĐT để mua)
         *      4. Thoát
         * */

        Scanner sc = new Scanner(System.in);
        GenericService<Product, String> productService = new ProductServiceImpl();
        GenericService<Order, String> orderService = new OrderServiceImpl();
        GenericService<OrderDetail, String> orderDetailService = new OrderDetailServiceImpl();
        // List giỏ hàng
        List<OrderDetail> carts = new ArrayList<>();

        while (true) {
            System.out.println("1. Mua hàng (Cung cấp mã sp và số lượng để thêm vào giỏ hàng)");
            System.out.println("2. Xem giỏ hàng (Hiển thị danh sách các sản phẩm đã mua)");
            System.out.println("3. Thanh toán (Cung cấp các thông tin về tên KH, SĐT để mua)");
            System.out.println("4. Đơn hàng đã mua");
            System.out.println("5. Thoát");
            System.out.println("6. Tìm kiếm ĐH hàng theo tên KH hoặc SĐT");
            System.out.println("7. Xem chi tiết ĐH (danh sách các sp đã mua)");
            System.out.print("Chọn chức năng: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("DANH SÁCH SẢN PHẨM");
                    for (Product item : productService.findAll()) {
                        System.out.printf("Mã sp: %s | Tên sp: %s | Giá: %.0f | Số lượng: %d\n",
                                item.getProductId(), item.getProductName(), item.getPrice(), item.getQuantity());
                    }
                    while (true) {
                        System.out.print("Nhập mã sp cần ('exit' để thoát): ");
                        String proId = sc.nextLine();
                        if (proId.equals("exit"))
                            break;
                        Product _product = productService.findId(proId);
                        if (_product != null) {
                            System.out.print("Số lượng: ");
                            int qyt = Integer.parseInt(sc.nextLine());
                            // Kiểm tra số lượng
                            // ?????
                            OrderDetail cartItem = new OrderDetail();
                            cartItem.setProductId(proId);
                            cartItem.setQuantity(qyt);
                            cartItem.setPrice(_product.getPrice());
                            // Kiểm tra trùng lặp
                            // ?????
                            carts.add(cartItem);
                        } else {
                            System.out.println("Mã sản phẩm không tồn tại!");
                        }
                    }
                    break;
                case 2:
                    System.out.println("GIỎ HÀNG");
                    double total = 0;
                    for (OrderDetail item : carts) {
                        System.out.printf("Mã sp: %s | Tên sp: %s | Giá: %.0f | Số lượng: %d | Thành tiền: %.0f\n",
                                item.getProductId(), productService.findId(item.getProductId()).getProductName(),
                                item.getPrice(), item.getQuantity(), item.getQuantity() * item.getPrice());
                        total += item.getQuantity() * item.getPrice();
                    }
                    System.out.println(MessageFormat.format("TỔNG TIỀN: {0}", total));
                    break;
                case 3:
                    System.out.println("NHẬP THÔNG TIN KHÁCH HÀNG");
                    Order order = new Order();
                    System.out.print("Tên khách hàng: ");
                    order.setCustomerName(sc.nextLine());
                    System.out.print("SĐT: ");
                    order.setPhone(sc.nextLine());
                    order.setCreated(new Date());
                    order.setOrderId(UUID.randomUUID().toString());
                    System.out.println("Đơn hàng được tạo thành công lúc " + new Date());
                    System.out.println("Thanh toán hoàn tất");
                    // Lưu vào data
                    orderService.add(order);
                    for (OrderDetail cart : carts) {
                        cart.setOrderId(order.getOrderId());
                        orderDetailService.add(cart);
                        // Update SL sản phẩm đang có
                    }
                    // Làm mới giỏ hàng
                    carts = new ArrayList<>();
                    break;
                case 4:
                    System.out.println("ĐƠN HÀNG ĐÃ MUA");
                    for (Order o : orderService.findAll()) {
                        System.out.println(MessageFormat.format("Mã ĐH: {0} | Tên KH: {1} | SĐT: {2} | Ngày tạo: {3}",
                                o.getOrderId(), o.getCustomerName(), o.getPhone(), o.getCreated()));
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sai chức năng!");
                    break;
            }
        }
    }
}
