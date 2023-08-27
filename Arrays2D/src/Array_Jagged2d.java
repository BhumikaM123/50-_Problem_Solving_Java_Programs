//Write a java program to take 2 flower shops and 
//no of flowers in each shop first shop contains 3 flowers
//second shop contains 5 flowers
//collect the names of shops and their flower names of each shop
//and print it.
import java.util.Scanner;
public class Array_Jagged2d {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//implicit input with jagged array
		int arr[][] = new int[2][];
		arr[0] = new String[3];
		arr[1] = new int[5];
		//below for loop i value as 1 only for static values of elements in array
		//or else if we take every value input from user we should start from 0
		//because i,j values we store that are called indexes
		for(int i=0;i<arr.length;i++) {
			System.out.println("Pls enter the name of flower shop "+i);
			String flower = scan.next();
		
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("Enter the name of flower "+i+" "+"of flower shop name "+flower);
			
			arr[i][j] = scan.next();
		
			}
		}
		for(int i=2;i<=2;i++) {
			System.out.println("Pls enter the name of flower shop "+i);
			String flower = scan.next();
			
		for(int i1=1;i1<=5;i1++) {
			System.out.println("Enter the name of flower "+i1+" "+"of flower shop name"+flower);
			String name = scan.next();
			}
		
		}
		for(int i=1;i<=1;i++) {
			System.out.prinln();
		}
		
		for(int i1=1;i1<=3;i1++) {
			System.out.println("Enter the name of flower "+i1+" "+"of flower shop name "+flower);
			String name = scan.next();
			}
		}
		
		
		
		
		
		
		
		
		}
}

