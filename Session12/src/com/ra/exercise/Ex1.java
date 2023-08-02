package com.ra.exercise;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataContext context = new DataContext("src/resource/data.db");
        CategoryService service = new CategoryService(context);
        while (true) {
            System.out.println("1. Thêm");
            System.out.println("2. Sửa");
            System.out.println("3. Xóa");
            System.out.println("4. Hiển thị");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    Category c = new Category();
                    System.out.print("Mã danh mục: ");
                    c.setId(sc.nextLine());
                    System.out.print("Tên danh mục: ");
                    c.setName(sc.nextLine());
                    System.out.print("Trạng thái: ");
                    c.setStatus(Boolean.parseBoolean(sc.nextLine()));
                    service.add(c);
                    break;
                case 2:
                    System.out.print("Mã danh mục: ");
                    String idEdit = sc.nextLine();
                    Category catEdit = service.find(idEdit);
                    System.out.println("Cập nhật thông tin");
                    System.out.print("Tên danh mục: ");
                    catEdit.setName(sc.nextLine());
                    System.out.print("Trạng thái: ");
                    catEdit.setStatus(Boolean.parseBoolean(sc.nextLine()));
                    service.edit(catEdit);
                    break;
                case 3:
                    System.out.print("Mã danh mục: ");
                    String idDel = sc.nextLine();
                    service.remove(idDel);
                    break;
                case 4:
                    System.out.println("DANH SÁCH DANH MỤC");
                    for (Category item : service.findAll()) {
                        System.out.println("Mã danh mục: " + item.getId());
                        System.out.println("Tên danh mục: " + item.getName());
                        System.out.println("Trạng thái: " + item.isStatus());
                        System.out.println("-------");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn sai chức năng!");
            }
        }
    }
}
