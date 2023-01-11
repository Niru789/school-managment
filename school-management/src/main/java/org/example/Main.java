package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student student = new Student();
        student.setId(9);
        student.setName("Shrinidhi");
        System.out.println(student.getName());

        Student student1 = new Student("Basu " ,10);


        System.out.println(student1.getName());
    }
}