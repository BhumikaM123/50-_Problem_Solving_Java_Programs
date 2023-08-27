package com.kodnest.loops;

import java.util.Scanner;

public class NestedDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudents;
        do {
            System.out.print("Enter the number of students: ");
            numStudents = scanner.nextInt();

            if (numStudents <= 0) {
                System.out.println("Invalid input. Please enter a positive number.");
            }
        } while (numStudents <= 0);

        int studentCount = 1;
        do {
            System.out.println("Student " + studentCount);
            int totalMarks = 0;
            int numSubjects;
            do {
                System.out.print("Enter the number of subjects for this student: ");
                numSubjects = scanner.nextInt();

                if (numSubjects <= 0) {
                    System.out.println("Invalid input. Please enter a positive number.");
                }
            } while (numSubjects <= 0);

            int subjectCount = 1;
            do {
                System.out.print("Enter the marks for subject " + subjectCount + ": ");
                int marks = scanner.nextInt();

                totalMarks += marks;
                subjectCount++;
            } while (subjectCount <= numSubjects);

            double averageMarks = (double) totalMarks / numSubjects;
            System.out.println("Average marks for this student: " + averageMarks);

            studentCount++;
        } while (studentCount <= numStudents);

        scanner.close();
    }
}
