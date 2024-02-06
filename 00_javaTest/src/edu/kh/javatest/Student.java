package edu.kh.javatest;

public class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("John", 20);
        students[1] = new Student("Jane", 22);
        students[2] = new Student("Jim", 19);

        for (Student student : students) {
            System.out.println("Name: " + student.name + ", Age: " + student.age);
        }
    }
}
