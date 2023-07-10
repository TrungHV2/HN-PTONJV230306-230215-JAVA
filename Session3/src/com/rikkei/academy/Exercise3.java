package com.rikkei.academy;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        /**
         * Viết chương trình Java, nhập vào các phần tử số nguyên của một ma trận vuông là mảng 2 chiều có m x n phần tử.
         * Với m và n là số hàng và số cột được nhập từ bàn phím.
         * - In ra ma trận số vừa nhập
         * - Tính tổng giá trị các phần tử nằm trên đường biên, đường chéo chính, đường chéo phụ
         * - Sắp xếp các phần tử trong ma trận tăng dần theo cột
         * VD:
         * 1 2 3 2 1
         * 4 5 6 5 4
         * 7 8 9 8 7
         * 4 5 6 5 4
         * 1 2 3 2 1
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng và cột của ma trận mxn: ");
        int n = Integer.parseInt(sc.nextLine());
        // Khai báo và khởi tạo mảng
        int[][] numbers = new int[n][n];
        // Duyệt mảng để nhập giá trị
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("numbers[%d,%d] = ", i, j);
                numbers[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        // Duyệt hiển thị
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        int sBorder = 0, sMain = 0, sAux = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n-1 || j == n-1)
                    sBorder += numbers[i][j];
                if (i == j)
                    sMain += numbers[i][j];
                if (i + j == n-1)
                    sAux += numbers[i][j];
            }
        }
        System.out.println("Tổng các phần tử trên đường biên: " + sBorder);
        System.out.println("Tổng các phần tử trên đường chéo chính: " + sMain);
        System.out.println("Tổng các phần tử trên đường chéo phụ: " + sAux);
        System.out.println("Tổng các phần tử trên đường chéo phụ: " + sAux);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int t = j + 1; t < n; t++) {
                    if (numbers[j][i] > numbers[t][i]) {
                        int temp = numbers[j][i];
                        numbers[j][i] = numbers[t][i];
                        numbers[t][i] = temp;
                    }
                }
            }
        }

        // Duyệt hiển thị
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
