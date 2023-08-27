package com.arrays.level4;
public class Sum {
public int Sum1(int arr[]) {
	int sum=0;
	for(int i=0;i<=arr.length-1;i++) {
		
		sum=sum+arr[i];
	}
	return sum;
}
}
