package com.tnsif.entityassignment;

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String department;

    // Constructor
    public Student(int rollNo, String name, int age, String department) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Getters
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    // Display student details
    public void displayStudent() {
        System.out.println("Roll No     : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Department  : " + department);
        System.out.println("---------------------------");
    }
}
