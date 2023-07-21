package com.ra.generic;

public class Program {
    public static void main(String[] args) {
        int a = 5, b = 6;
        String str1 = "Abc", str2 = "Xyz";
        double x = 7, y = 9;

        swapGeneric(a, b);
        swapGeneric(str1, str2);
        swapGeneric(x, y);


        ServiceImp<Product, String> categoryServiceImp = new ServiceImp();
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + " | b = " + b);
    }
    public static void swap(double a, double b) {
        double temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + " | b = " + b);
    }

    public static <T> void swapGeneric(T a, T b) {
        T temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + " | b = " + b);

    }
}
