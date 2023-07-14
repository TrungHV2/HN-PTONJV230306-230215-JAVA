package com.rikkei.academy.exercise;

import java.text.MessageFormat;
import java.util.Scanner;

public class Employee extends Person {
    private String companyName;

    public Employee() {

    }

    public Employee(String fullName, boolean gender, String address, String companyName) {
        super(fullName, gender, address);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("Tên công ty: ");
        companyName = sc.nextLine();
    }

    @Override
    public String toString() {
        return MessageFormat.format("%sCông ty: %s\n", companyName);
    }
}
