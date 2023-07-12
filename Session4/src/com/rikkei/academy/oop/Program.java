package com.rikkei.academy.oop;

public class Program {
    public static void main(String[] args) {
        Student st = new Student();
        Student st1 = new Student("Hoàng Văn Trung", "trunghv@gmail.com");
        System.out.println("st.fullName = " + st.getFullName());
        System.out.println("st1.fullName = " + st1.getFullName());
        st.hello();
        st1.hello();

        //Student.test();
    }
}
