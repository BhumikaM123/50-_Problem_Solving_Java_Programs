package com.arrays.level1;
import java.util.Scanner;
public class Second {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of array");
	int arr[] = new int[scan.nextInt()];
	System.out.println("Enter the contents of array");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i] = scan.nextInt();
	}
	System.out.println("The contents of array are");
	//Enhanced for loop for printing
	for(int a : arr) {
		System.out.print(a+5 +" ");
	}
	scan.close();
}
}

