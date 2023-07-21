package com.ra.list;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        int a = 5;
        names.add("Abc");
        names.add("Xyz");

        for (String s : names) {
            System.out.println(s);
        }

        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);

        List<Integer> numersLinked = new LinkedList<>();

        numersLinked.add(5);
        numersLinked.add(6);
        numersLinked.add(7);
        numersLinked.add(8);
        numersLinked.add(9);

        for (int n : numersLinked) {
            System.out.println(n);
        }

        Set<String> stringNoDuplicate = new HashSet<>();
        stringNoDuplicate.add("A");
        stringNoDuplicate.add("B");
        stringNoDuplicate.add("C");
        stringNoDuplicate.add("D");
        stringNoDuplicate.add("A");

        for (String s : stringNoDuplicate) {
            System.out.println(s);
        }

    }
}
