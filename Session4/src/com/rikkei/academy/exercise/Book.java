package com.rikkei.academy.exercise;

import java.util.Scanner;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private double price;
    private int year;
    private boolean status;

    //#region Constructor
    public Book() {
    }

    public Book(String bookId, String title, String author, double price, int year, boolean status) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
        this.status = status;
    }
    //#endregion

    //#region GETTER/SETTER

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //#endregion

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        boolean checkInput = true;
        do {
            System.out.print("Nhập mã sách: ");
            String id = sc.nextLine();
            if (id.startsWith("SP")) {
                this.bookId = id;
                checkInput = true;
            } else {
                checkInput = false;
                System.out.println("Mã sách phải bắt đầu bằng \"SP\"");
            }
        } while (!checkInput);
        System.out.print("Nhập tên sách: ");
        this.title = sc.nextLine();
        System.out.print("Nhập tác giả: ");
        this.author = sc.nextLine();
        System.out.print("Nhập giá: ");
        this.price = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập năm xuất bản: ");
        this.year = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập trạng thái (true/false): ");
        this.status = Boolean.parseBoolean(sc.nextLine());
    }
    public void outputData() {
        System.out.println("Mã sách: " + this.bookId);
        System.out.println("Tên sách: " + this.title);
        System.out.println("Tác giả: " + this.author);
        System.out.println("Giá: " + this.price);
        System.out.println("Năm xuất bản: " + this.year);
        System.out.println("Trạng thái: " + (this.status ? "Còn hàng" : "Hết hàng"));
    }
}
