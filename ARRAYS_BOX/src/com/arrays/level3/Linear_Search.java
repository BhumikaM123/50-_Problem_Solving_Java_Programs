package com.arrays.level3;

public class Linear_Search {
public static int search_done(int arr[],int key) {
	for(int i=0;i<=arr.length-1;i++) {
		if(key==arr[i]) {
			
			return i;
		}
		
	}
	return -1;
}
}