package com.arrays.level1;
import java.util.Scanner;
public class First {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of array");
	int arr[] = new int[scan.nextInt()];
	System.out.println("Enter the contents of array");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i] = scan.nextInt();
	}
	System.out.println("The contents of array are");
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i]+" ");
	}
	scan.close();
}
}
