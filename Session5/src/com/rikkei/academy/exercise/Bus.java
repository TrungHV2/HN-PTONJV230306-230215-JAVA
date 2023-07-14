package com.rikkei.academy.exercise;

public class Bus {
    private int currentSize;
    private Person[] customers;
    private String busNo;

    public Bus(int size) {
        customers = new Person[size];
        currentSize = 0;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public Person[] getCustomers() {
        return customers;
    }

    public void setCustomers(Person[] customers) {
        this.customers = customers;
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }

    public void report() {
        int countStudent = 0, countEmployee = 0;
        for (int i = 0; i < currentSize; i++) {
            if (customers[i] instanceof Student)
                countStudent++;
            if (customers[i] instanceof Employee)
                countEmployee++;
        }
        System.out.println("Số sinh viên trên xe là: " + countStudent);
        System.out.println("Số nhân viên trên xe là: " + countEmployee);
    }
    public boolean push(Person p) {
        if (currentSize < customers.length) {
            customers[currentSize] = p;
            currentSize++;
            return true;
        } else {
            return false;
        }
    }
    public void searchBySchool(String schoolName) {

    }
    public void searchByCompany(String companyName) {

    }
}
