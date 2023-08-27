import java.util.Scanner;
public class Boolean_Array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to MartialApp");
		System.out.println("pls enter the number of people to update their martial status");
		boolean []arr = new boolean[scan.nextInt()];
		scan.nextLine();
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("enter the martial status of"+" "+i+" "+"person  "+"is he/she married");
			arr[i]=scan.nextBoolean();
		}
		System.out.println("The people status are");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("The person"+" "+i+" "+"who is married"+" "+arr[i]);
		}
		scan.close();
	}

}
