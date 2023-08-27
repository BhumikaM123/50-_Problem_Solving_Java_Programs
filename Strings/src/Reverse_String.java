import java.util.Scanner;
public class Reverse_String {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the String");
	String s1=scan.nextLine();
	System.out.println("Before Reversing...");
	System.out.println(s1);
	char arr1[]= s1.toCharArray();
	char arr2[]=new char[arr1.length];
	int j=arr2.length-1;
	for(int i=0;i<=arr1.length-1;i++) {
		arr2[j]=arr1[i];
		j--;
	}
	String s2=new String(arr2);
	System.out.println("After Reversing.....");
	
	System.out.println(s2);
	if(s1.equals(s2)) {
		System.out.println("String provided are Palindrome");
	}
		else {
			System.out.println("Strings Provided are not palindrome");
		}
	
	scan.close();
}
}
