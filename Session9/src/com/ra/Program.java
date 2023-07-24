package com.ra;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();

        stringStack.push("A");
        stringStack.push("B");
        stringStack.push("C");
        stringStack.push("D");
        stringStack.push("E");
        stringStack.push("F");

        stringStack.pop();
        stringStack.pop();
        stringStack.pop();

        for (String str : stringStack) {
            System.out.println(str);
        }

        Queue<String> stringQueue = new PriorityQueue<>();

        String str = "";
        str.compareTo("Abc");

        SortedSet<Book> books = new TreeSet<>();
        books.add(new Book("1", "Book 1", 100, "RA"));
        books.add(new Book("2", "Book 2", 200, "RA"));
        books.add(new Book("3", "Book 3", 300, "RA"));
        books.add(new Book("4", "Book 4", 400, "RA"));
        books.add(new Book("5", "Book 5", 500, "RA"));

        System.out.println("Danh sách sắp xếp");
        for (Book b : books) {
            System.out.println(b.getTitle());
        }

        System.out.println("------------");

        Map<String, Book> bookMap = new HashMap<>();

        bookMap.put("B001", new Book("1", "Book 1", 500, "RA"));
        bookMap.put("B002", new Book("2", "Book 2", 450, "RA"));
        bookMap.put("B003", new Book("3", "Book 3", 500, "RA"));
        bookMap.put("B004", new Book("4", "Book 4", 500, "RA"));
        bookMap.remove("B002");
        for (String key : bookMap.keySet()) {
            System.out.println(bookMap.get(key).getTitle());
        }

        for (Book b : bookMap.values()) {
            System.out.println(b.getTitle());
        }
    }
}
