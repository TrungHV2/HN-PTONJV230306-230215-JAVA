package com.ra;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class ReadWriteObject {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("SV01", "Nguyễn Văn A", true),
                new Student("SV02", "Nguyễn Văn B", true),
                new Student("SV03", "Nguyễn Văn C", false),
                new Student("SV04", "Nguyễn Văn D", true),
                new Student("SV05", "Nguyễn Văn E", false)
        );
        String path = "database.txt";
        //WriteObject(path, students);
        ReadObject(path);
    }

    public static void WriteObject(String path, List<Student> data) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(data);

            oos.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void ReadObject(String path) {
        try {
            FileInputStream fos = new FileInputStream(path);
            ObjectInputStream oos = new ObjectInputStream(fos);

            List<Student> data = (List<Student>)oos.readObject();

            oos.close();
            for (Student s : data)
                System.out.println(s.getId() + " | " + s.getName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
