package com.ra.exercise1;

public class Program {
    public static void main(String[] args) {
        Person p = new Person("Nguyễn Văn A", "Hà Nội");
        System.out.println(p);

        Student st = new Student("Student Name", "Hà Nội", "Online", 2023, 10000);
        System.out.println(st);

        Staff sf = new Staff("Staff Name", "Hà Nội", "Rikkei Academy", 5000);
        System.out.println(sf);
    }
}
