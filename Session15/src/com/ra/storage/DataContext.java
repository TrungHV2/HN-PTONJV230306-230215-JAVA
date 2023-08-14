package com.ra.storage;

import com.ra.model.Class;
import com.ra.model.Mark;
import com.ra.model.Student;
import com.ra.model.Subject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DataContext {
    private List<Class> classes;
    private List<Student> students;
    private List<Subject> subjects;
    private List<Mark> marks;

    public DataContext() {
        this.classes = read("storage/classes.txt", Class.class);
        this.students = read("storage/students.txt", Student.class);
        this.subjects = read("storage/subjects.txt", Subject.class);
        this.marks = read("storage/marks.txt", Mark.class);
    }

    public List<Class> getClasses() {
        return classes;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public boolean save() {
        try {
            write("storage/classes.txt", this.classes);
            write("storage/students.txt", this.students);
            write("storage/subjects.txt", this.subjects);
            write("storage/marks.txt", this.marks);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    private <T> List<T> read(String path, java.lang.Class<T> clazz) {
        try {
            FileInputStream file = new FileInputStream(path);
            ObjectInputStream os = new ObjectInputStream(file);
            List<T> data = (List<T>)os.readObject();

            file.close();
            os.close();
            return data;
        } catch (Exception ex) {
            //ex.printStackTrace();
        }
        return new ArrayList<>();
    }

    private <T> boolean write(String path, List<T> data) {
        try {
            FileOutputStream file = new FileOutputStream(path);
            ObjectOutputStream os = new ObjectOutputStream(file);
            os.writeObject(data);

            file.close();
            os.close();
            return true;
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
