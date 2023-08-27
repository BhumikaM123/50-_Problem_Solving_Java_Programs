import java.util.Scanner;
public class AdditionApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first and second number");
		long num1 = scan.nextLong();
		long num2 = scan.nextLong();
		System.out.println("The Addition of Two Numbers are: "+" "+GalaxyArithmetic.galaticAddition(num1,num2));
		scan.close();
	}
	

}
