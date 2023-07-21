package com.ra.generic.exercise;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Product> products = Arrays.asList(
                new Product(1, "Tivi",3500, 10),
                new Product(2, "Điều hòa",7000, 10),
                new Product(3, "Tủ lạnh",7500, 10),
                new Product(4, "Quạt",350, 10),
                new Product(5, "Nồi cơm",500, 10)
        );

        // List giỏ hàng
        List<CartItem> carts = new ArrayList<>();

        while (true) {
            System.out.println("1. Danh sách sản phẩm");
            System.out.println("2. Mua hàng");
            System.out.println("3. Xem giỏ hàng");
            System.out.println("4. Thoát");
            System.out.println();
            System.out.print("Chọn chức năng: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("DANH SÁCH SẢN PHẨM");
                    for (Product p : products) {
                        System.out.println(p);
                        System.out.println("___________");
                    }
                    break;
                case 2:
                    System.out.print("Nhập mã sp: ");
                    int _id = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập số lượng: ");
                    int _qty = Integer.parseInt(sc.nextLine());
                    // Tìm sp cần mua
                    Product _pro = products.stream().filter(x -> x.getId() == _id).findFirst().orElse(null);
                    if (_pro ==null) {
                        System.out.println("Máp ko tồn tại!");
                    } else {
                        // Thêm vào giỏ hàng
                        CartItem oldItem = carts.stream().filter(x -> x.getProduct().getId() == _id).findFirst().orElse(null);
                        if (oldItem != null) {
                            // Update số lượng
                            oldItem.setQuantity(oldItem.getQuantity() + _qty);
                        } else {
                            // Chưa có thì thêm mới
                            carts.add(new CartItem(_pro, _qty));
                        }
                        // Update số lượng
                        _pro.setQuantity(_pro.getQuantity() - _qty);
                    }
                    break;
                case 3:
                    System.out.println("GIỎ HÀNG ĐÃ MUA");
                    System.out.println("+-------+---------------+-----+----------+---------------+");
                    System.out.println("| Mã SP + Tên sản phẩm  | SL  | Đơn giá  | Thành tiền    |");
                    System.out.println("+-------+---------------+-----+----------+---------------+");
                    for (CartItem c : carts) {
                        System.out.printf("| %5d | %13s | %3d | %8.0f | %13.0f |\n", c.getProduct().getId(), c.getProduct().getName(), c.getQuantity(), c.getProduct().getPrice(), (c.getQuantity() * c.getProduct().getPrice()));
                    }
                    System.out.println("+-------+---------------+-----+----------+---------------+");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sai tính năng!");
            }
        }
    }
}
class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public CartItem() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}