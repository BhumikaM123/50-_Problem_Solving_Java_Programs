package com.arrays.level1;
import java.util.Scanner;
public class Third {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of an array");
	int arr[] = new int[scan.nextInt()];
	System.out.println("Enter the elements in an array");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("The array elements are...");
	for (int x : arr) { //ctr+space
		if(x>=0) {
			System.out.print(x+" ");
		}
	}
	scan.close();
}
}
