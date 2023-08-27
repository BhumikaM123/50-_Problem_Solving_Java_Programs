import java.util.Scanner;
public class GCD_App {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the two integers to find their GCD");
	int m = scan.nextInt();
	int n = scan.nextInt();
	GCD_Finder gcd = new GCD_Finder();
	System.out.println("THE GCD IS  "+ gcd.GCD_Find(m,n));
	scan.close();
}
}
