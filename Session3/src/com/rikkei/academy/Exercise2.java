package com.rikkei.academy;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        /**
         * Viết chương trình Java, nhập vào mảng n số nguyên (n nhập từ bàn phím).
         * Hiển thị ra màn hính số chữ số dương liên tiếp lớn nhất trong mảng
         * VD: [1,2,-5,5,6,7,8,-1,4,7,8] => 4
         * */
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("number["+ i + "] = ");
            numbers[i] = Integer.parseInt(sc.nextLine());
        }
        // Đếm số
        int countMax = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] < 0 || i == n-1) {
                if (count > countMax)
                    countMax = count;
                count = 0;
            } else {
                count++;
            }
        }
        System.out.println("Số chữ số dương liên tiếp lớn nhất là: " + countMax);
    }
}
