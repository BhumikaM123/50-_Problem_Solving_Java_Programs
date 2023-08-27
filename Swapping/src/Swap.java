import java.util.Scanner;
public class Swap {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int help;
	System.out.println("Enter the two numbers");
	int x = scan.nextInt();
	int y = scan.nextInt();
	System.out.println("Before Swapping " +x+" "+y);
	help=x;
	x=y;
	y=help;
	System.out.println("After swapping "+x+" "+y);
	scan.close();
	
	}
}
