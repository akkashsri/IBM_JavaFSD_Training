package com.example;

public class Tester2 {
    public static void main(String[] args) {
        Student student = new Student(1, "Akash", 9.1);
        Student student2 = new Student(1, "Akash", 9.1);
        System.out.println(student==student2);
        System.out.println(student.equals(student2));
        System.out.println(student);
        System.out.println(student2);
    }
}
