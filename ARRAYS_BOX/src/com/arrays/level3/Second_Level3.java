package com.arrays.level3;
import java.util.Scanner;
public class Second_Level3 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of array");
	int arr1[] = new int[scan.nextInt()];
	System.out.println("Enter the  "+arr1.length+"  elements in an array");
	for(int i=0;i<=arr1.length-1;i++) {
		arr1[i]=scan.nextInt();
	}
	System.out.println("The First array elements are...");
	for(int i=0;i<=arr1.length-1;i++) {
		System.out.print(arr1[i]+" ");
	}
	System.out.println();
	System.out.println("The New Array Elements are...");
	int arr2[]=new int[arr1.length];
	for(int i=0;i<=arr2.length-1;i++) {
		arr2[i]=arr1[i];
	}
	for(int i=0;i<=arr2.length-1;i++) {
	System.out.print(arr2[i]+" ");
	}
	scan.close();
}
}
