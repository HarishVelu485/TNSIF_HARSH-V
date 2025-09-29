package com.tnsif.entityassignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        // Collect 3 students details
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Enter Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            students[i] = new Student(rollNo, name, age, dept);
            System.out.println();
        }

        // Display all students
        System.out.println("=== Student Details ===");
        for (Student s : students) {
            s.displayStudent();
        }

        sc.close();
    }
}
