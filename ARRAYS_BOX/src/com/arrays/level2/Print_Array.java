package com.arrays.level2;

public class Print_Array {
	public static void PrintArray(int arr[]){
	
		System.out.println("The Forward Direction Array Elements are...");
		for (int x : arr)  //ctr+space
			{
				//System.out.println("The Forward Direction Array Elements are...");
				System.out.print(x+" ");
			}
			System.out.println();
			System.out.println("The Reverse Direction Array Elements are...");
		for (int i=arr.length-1;i>=0;i--) { //ctr+space
		
				//System.out.println("The Reverse Direction Array Elements are...");
				System.out.print(arr[i]+" ");
			}
		}


	
	  
}