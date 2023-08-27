package com.arrays.level4;
import java.util.Scanner;
public class Second_Level4 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of array");
	int arr1[] = new int[scan.nextInt()];
	System.out.println("Enter the  "+arr1.length+"  elements in an array");
	for(int i=0;i<=arr1.length-1;i++) {
		arr1[i]=scan.nextInt();
	}
	System.out.println("The 1st Array elements are...");
	for(int x : arr1 ) {
		System.out.print(x+" ");
	}
	System.out.println();
	int arr2[] = new int[arr1.length];
	System.out.println("Enter the  "+arr2.length+"  elements in an array");
	for(int i=0;i<=arr2.length-1;i++) {
		arr2[i]=scan.nextInt();
	}
	System.out.println("The 2nd Array elements are...");
	for(int x : arr2 ) {
		System.out.print(x+" ");
	}
	System.out.println();
	System.out.println("The Merged Array Elements are....");
	int arr3[] = new int[arr1.length+arr2.length];
	int index=0;
	for(int i=0;i<=arr1.length-1;i++) {
		arr3[index]=arr1[i];
		index++;
	}
	for(int j=0;j<=arr2.length-1;j++) {
		arr3[index]=arr2[j];
		index++;
	}
	for (int k : arr3) {
		System.out.print(k+" ");
	}
	scan.close();
}
	
}

