import java.util.Scanner;
public class Binary {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of array");
	int arr[]=new int[scan.nextInt()];
	System.out.println("Enter the array elements..");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("The array elements are...");
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Enter the key element to search in an array");
	int key = scan.nextInt();
	int res = Binary_Finder.search(key,arr);
	if(res>=0) {
		System.out.println("Hey.....Key Found...at index  "+res);
	}else {
		System.out.println("Hmm....Key Not Found...");
	}

scan.close();
}
}
