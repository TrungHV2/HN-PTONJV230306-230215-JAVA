package com.ra.entity;

import com.ra.itf.IStudent;

import java.util.Objects;
import java.util.Scanner;

public class Student implements IStudent {
    private String studentId;
    private String studentName;
    private int age;
    private float mathScore;
    private float physicalScore;
    private float chemistryScore;
    private float avgScore;
    private boolean status;

    public Student() {
    }
    public Student(String studentId) {
        this.studentId = studentId;
    }

    public Student(String studentId, String studentName, int age, float mathScore, float physicalScore, float chemistryScore, float avgScore, boolean status) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.mathScore = mathScore;
        this.physicalScore = physicalScore;
        this.chemistryScore = chemistryScore;
        this.avgScore = avgScore;
        this.status = status;
    }

    //#region GET/SET
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getMathScore() {
        return mathScore;
    }

    public void setMathScore(float mathScore) {
        this.mathScore = mathScore;
    }

    public float getPhysicalScore() {
        return physicalScore;
    }

    public void setPhysicalScore(float physicalScore) {
        this.physicalScore = physicalScore;
    }

    public float getChemistryScore() {
        return chemistryScore;
    }

    public void setChemistryScore(float chemistryScore) {
        this.chemistryScore = chemistryScore;
    }

    public float getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(float avgScore) {
        this.avgScore = avgScore;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    //#endregion

    public void calculatorAvg() {
        avgScore = (mathScore + physicalScore + chemistryScore) / 3;
    }

    public void checkPass() {
        if (avgScore > 5) {
            System.out.println(studentName + ": PASS");
        } else {
            System.out.println(studentName + ": FAIL");
        }
    }

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã sinh viên: ");
        studentId = sc.nextLine();
        System.out.print("Tên sinh viên: ");
        studentName = sc.nextLine();
        System.out.print("Tuổi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("Điểm toán: ");
        mathScore = Float.parseFloat(sc.nextLine());
        System.out.print("Điểm lý: ");
        physicalScore = Float.parseFloat(sc.nextLine());
        System.out.print("Điểm hóa: ");
        chemistryScore = Float.parseFloat(sc.nextLine());
        System.out.print("Trạng thái (true/false): ");
        status = Boolean.parseBoolean(sc.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Tên sinh viên: " + studentName);
        System.out.println("Tuổi: " + age);
        System.out.println("Điểm toán: " + mathScore);
        System.out.println("Điểm lý: " + physicalScore);
        System.out.println("Điểm hóa: " + chemistryScore);
        System.out.println("Điểm trung bình: " +avgScore);
        System.out.println("Trạng thái (true/false): " + status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}
