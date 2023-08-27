package com.arrays.level3;
import java.util.Scanner;
public class Array_App {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of array elements");
	int arr[] = new int[scan.nextInt()];
	System.out.println("Enter the"+" "+arr.length+" "+"elements into the array");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("Enter the key element to search");
	int key = scan.nextInt();
	int res = Linear_Search.search_done(arr , key);
	if(res>=0) {
		System.out.println("key element found in  "+"index  "+res);
	}else
	{
		System.out.println("key doesnt found sorry....try next time");
	}
	scan.close();
}
}
