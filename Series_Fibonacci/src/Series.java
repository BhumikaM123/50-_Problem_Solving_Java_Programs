import java.util.Scanner;
public class Series {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Pls enter the number to get their sequence fibonacci series");
	int n = scan.nextInt();
	Find_Seriess.Find_Serie(n);
	scan.close();
}
}
