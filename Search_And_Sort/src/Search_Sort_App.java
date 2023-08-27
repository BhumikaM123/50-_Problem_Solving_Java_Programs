import java.util.Scanner;
public class Search_Sort_App {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	while(true) {
	System.out.println("WELCOME TO SORT AND SEARCH WORLD");
	System.out.println("Enter the array length");
	int arr[]=new int[scan.nextInt()];
	System.out.println("Enter the"+" "+arr.length+" "+"elements into the array");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("The array elements BEFORE SORTING are.....");
	for(int x : arr) {
		System.out.print(x+" ");
	}
	System.out.println();
	System.out.println("Please enter the sorting technique before searching your key");
	System.out.println("Enter 1------------>BUBBLE SORT");
	System.out.println("2----------------->SELECTION SORT");
	System.out.println("3----------------->INSERTION SORT");
	int sort = scan.nextInt();
	
	switch(sort) {
	case 1:Search_Sort.Bubble_Sort(arr);
		break;
	case 2:Search_Sort.Selection_Sort(arr);
		break;
	default:Search_Sort.Insertion_Sort(arr);
	}
	System.out.println("The array elements AFTER SORTING are.....");
	for(int x : arr) {
		System.out.print(x+" ");
	}
	System.out.println();
	System.out.println("hey........its time to search your key so please enter the key to search");
	int key=scan.nextInt();
	System.out.println("press 1-------->LINEAR SEARCH");
	System.out.println("press 2-------->BINARY SEARCH");
	int search=scan.nextInt();
	
	switch(search) {
	case 1:int res=Search_Sort.Linear_Search(key,arr);
	if(res>=0) {
		System.out.println("Key Found at Index"+" "+res);
	}else {
		System.out.println("Key Not Found");
	}
		break;
	default:int res1=Search_Sort.Binary_Search(key,arr);
	if(res1>=0) {
		System.out.println("Key Found at Index"+" "+res1);
	}else {
		System.out.println("Key Not Found");
	}
	}
	
	
}
}
}
