package com.ra.method;

public class Program {
    public static void main(String[] args) {
        String str = "            Abc                    ";
        System.out.println(str.trim());
        hello("TrungHV");
        int c = sum(5, 8);
        System.out.println("Tổng hai số 5 + 8 = " + c);
        int[] numbers = {1,2,3,4,5,6,7,8,0,9};
        int max = findMax(numbers);
        System.out.println("max = " + max);
    }

    public static void hello(String name) {
        System.out.println("Xin chào " + name);
    }
    public static int sum(int a, int b) {
        return a + b;
    }

    /*
    Định nghĩa phương thức với tham số đầu vào là 1 mảng số nguyên và trả về giá trị lớn nhất trong mảng.
    Gọi phương thức trong hàm main để kiểm tra
    * */
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }
        return max;
    }
}
