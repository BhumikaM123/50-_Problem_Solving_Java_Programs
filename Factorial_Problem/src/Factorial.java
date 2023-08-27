import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of N");
		int n = scan.nextInt();
		int product = 1;
		for(int i=1;i<=n;i++) {
			product = product*i;
		}
		System.out.println("The factorial of "+n+""+" is "+product );
	
scan.close();
}
}