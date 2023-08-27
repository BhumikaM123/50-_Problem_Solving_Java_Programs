package com.arrays.level2;
import java.util.Scanner;
public class First1_Level2{
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of an array");
	int arr[] = new int[scan.nextInt()];
	System.out.println("Enter the elements in an array");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	Print_Array.PrintArray(arr);
	
	
	scan.close();
}
}


