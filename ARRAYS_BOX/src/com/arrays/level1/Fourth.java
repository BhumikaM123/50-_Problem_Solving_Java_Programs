package com.arrays.level1;

import java.util.Scanner;
public class Fourth{
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of an array");
	int arr[] = new int[scan.nextInt()];
	System.out.println("Enter the elements in an array");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("The array elements Before Swapping are...");
	for (int x : arr)  //ctr+space
	    {
			System.out.print(x+" ");
			
		}
	    System.out.println();
	
	System.out.println("Enter the 2 indexes of that array"
			+ " so that we can swap that 2 elements");

	int a = scan.nextInt();
	int b = scan.nextInt();
	int help = arr[a];
	arr[a]=arr[b];
	arr[b]=help;
	System.out.println("After Swapping");
	for (int x : arr) {
		System.out.println(x);
	}
	scan.close();
}
}

