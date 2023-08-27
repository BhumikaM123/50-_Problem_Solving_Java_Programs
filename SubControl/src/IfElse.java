import java.util.Scanner;
public class IfElse {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Pls Enter the 1st Number");
	int num1 = scan.nextInt();
	System.out.println("Pls Enter the 2nd Number");
	int num2 = scan.nextInt();
	if(num1>num2) {
		int res1 = num2-num1;
		System.out.println("Result: We are subtracting 2nd num with 1st num"+" "+res1);
		
	}
	else
	{
		int res2 = num1-num2;
		System.out.println("Result: We are subtracting 1st num with 2nd num"+" "+res2);
	}
scan.close();
}
}
