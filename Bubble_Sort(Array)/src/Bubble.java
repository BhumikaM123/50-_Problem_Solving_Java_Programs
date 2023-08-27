import java.util.Scanner;
public class Bubble {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of array");
	int arr[] = new int[scan.nextInt()];
	System.out.println("Enter the"+" "+arr.length+" "+"elements into the array");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("The array elements before BUBBLE SORT are");
	for(int i:arr) {
		System.out.print(i+" ");
	}
	Sort sort = new Sort();
	sort.sorting(arr);
	System.out.println();
	System.out.println("The array after BUBBLE SORT are.....");
	for(int x:arr) {
		System.out.print(x+" ");
	}
	
	scan.close();
}
}
