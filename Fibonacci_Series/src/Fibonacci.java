import java.util.Scanner;
public class Fibonacci {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Pls enter the number to get their sequence fibonacci series");
	int n = scan.nextInt();
	Find_Series.Find_Serie(n);
	scan.close();
}
}
