import java.util.Scanner;

public class Array2d {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of banks");
		String [][]arr = new String[scan.nextInt()][];
		for(int i=0;i<=arr.length-1;i++) {
			 System.out.println("enter the number of customers of bank"+" "+i);
			 arr[i] = new String[scan.nextInt()];
		}
		for(int i=0;i<=arr.length-1;i++) {
			
			for(int j=0;j<=arr[i].length-1;j++) {
				
				System.out.println("enter the Name of customers"+" "+j+" "+"in bank"+" "+i);
				scan.next();
				arr[i][j]=scan.nextLine();
				
			}
		}
		System.out.println("The Names of each bank customers are.....");
		for(int i=0;i<=arr.length-1;i++) {
			
			for(int j=0;j<=arr[i].length-1;j++) {
				
			System.out.println("Bank"+" " +i+" "+"="+" "+"customer"+" "+j+" "+"name is"+" "+arr[i][j]+"  ");
				
			}
			System.out.println();
		}
		scan.close();
	}
}

