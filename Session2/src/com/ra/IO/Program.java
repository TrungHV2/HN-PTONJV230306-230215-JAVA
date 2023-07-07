package com.ra.IO;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        float a = Float.parseFloat(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        boolean c = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Nhập họ tên: ");
        String name = sc.nextLine();

        System.out.println("Họ và tên: " + name);
        System.out.println("Tuổi: " + age);
    }
}
