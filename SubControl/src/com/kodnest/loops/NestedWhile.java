package com.kodnest.loops;

import java.util.Scanner;

public class NestedWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalEmployees = 0;
        int totalSales = 0;

        System.out.print("Enter the number of departments: ");
        int numDepartments = scanner.nextInt();

        int departmentCount = 1;
        while (departmentCount <= numDepartments) {
            System.out.println("Department " + departmentCount);
            int employeeCount = 1;
            int departmentSales = 0;

            System.out.print("Enter the number of employees in this department: ");
            int numEmployees = scanner.nextInt();

            while (employeeCount <= numEmployees) {
                System.out.print("Enter the sales amount for employee " + employeeCount + ": ");
                int salesAmount = scanner.nextInt();
                departmentSales += salesAmount;
                employeeCount++;
            }

            System.out.println("Total sales for this department: " + departmentSales);
            totalEmployees += numEmployees;
            totalSales += departmentSales;
            departmentCount++;
        }

        System.out.println("Total employees in all departments: " + totalEmployees);
        System.out.println("Total sales for all departments: " + totalSales);

        scanner.close();
    }
}
