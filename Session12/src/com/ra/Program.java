package com.ra;

import java.io.File;

public class Program {
    public static void main(String[] args) {
        File file = new File("public/index.html");
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("Đây là file");
                System.out.println("getAbsolutePath: " + file.getAbsolutePath());
                System.out.println("getPath: " + file.getPath());
                System.out.println("getParent: " + file.getParent());
                System.out.println("getName: " + file.getName());
            } else {
                System.out.println("Đây là thư mục");
                //file.renameTo(new File("assets"));
                file.delete();
                System.out.println("Thư mục đã xóa!");
            }
        } else {
            System.out.println("Đường dẫn không tồn tại!");
            file.mkdir();
            System.out.println("Thư mục đã được tạo!");
        }
    }
}
