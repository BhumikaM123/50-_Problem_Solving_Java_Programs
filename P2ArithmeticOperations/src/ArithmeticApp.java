import java.util.Scanner;
public class ArithmeticApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("pls enter the num1 and num2");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("The subtraction is"+" "+ArithmeticDeveloper.subtractNumbers(num1,num2));
		System.out.println("The multiplication is"+" "+ArithmeticDeveloper.multiplyNumbers(num1,num2));
		System.out.printf("The divide is"+" "+"%.2f\n",ArithmeticDeveloper.divideNumbers(num1,num2));
		System.out.println("The remainder is"+" "+ArithmeticDeveloper.findReminder(num1,num2));
scan.close();
}
}