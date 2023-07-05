package com.rikkei.array;

public class Program {
    public static void main(String[] args) {
        // In xong xuống dòng
        System.out.println("Packages");
        // In không xuống dòng
        System.out.print("Packages");
        System.out.print("Packages");
        String name = "Hoàng Văn Trung";
        int age = 29;
        boolean gender = true;
        // In theo định dạng, f là viết tắt của format
//        System.out.printf("Tên tôi là " + name + ". Năm nay tôi " + age + " tuổi");
        /*
        %s: Chuỗi (String)
        %d: số nguyên (byte, short, int, long)
        %f: số thực (double, float)
        %c: kí tự (char)
        %b: boolean
        * */
        System.out.printf("Tên tôi là %s. Năm nay tôi %d tuổi, giới tính %b", name, age, gender);
    }
}
