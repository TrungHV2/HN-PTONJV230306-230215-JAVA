package com.ra.excep.exercise;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<Student> students = new ArrayList<>(List.of(
            new Student("SV01", "Nam", "nam@gmail.com", "0962229893", "C01", true)
    ));
    public static List<Class> classes = new ArrayList<>();
}
