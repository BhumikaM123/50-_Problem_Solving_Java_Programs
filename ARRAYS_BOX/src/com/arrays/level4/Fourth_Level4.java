package com.arrays.level4;
import java.util.Scanner;
public class Fourth_Level4 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of array");
	int arr1[] = new int[scan.nextInt()];
	System.out.println("Enter the "+arr1.length+"  elements in an array");
	for(int i=0;i<=arr1.length-1;i++) {
		arr1[i]=scan.nextInt();
	}
	System.out.println("The Array elements are...");
	for(int x : arr1 ) {
		System.out.print(x+" ");
	}
	System.out.println();
	Negative n = new Negative();
	int res[]=n.Negative_(arr1);
	System.out.println("Replacing -ve elements into 0 then Array elements are...");
	for (int i : res) {
		System.out.print(i+" ");
	}
	scan.close();
}
	
}



