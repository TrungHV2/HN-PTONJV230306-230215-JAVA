package com.ra.strings;

public class TestRegex {
    public static void main(String[] args) {
        String username = "adminAdmin";
        String password = "A123456";
        String email = "abc@gmail.com";
        String phone = "0987654321";

        System.out.println(username.matches("[a-zA-Z]{10,15}"));
        System.out.println(password.matches("^[A-Z][\\w]{5,11}$"));
        System.out.println(email.matches("^[\\w.]+@[\\w.-]+\\.[a-z]{2,4}$"));
        System.out.println(phone.matches("^0[98765432][\\d]{8}$"));

        System.out.println(phone.replaceAll("(\\d{6})(\\d{4})", "xxxxxx$2"));
    }
}
