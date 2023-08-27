import java.util.Scanner;
public class Calci {
	Scanner scan = new Scanner(System.in);
	public void add() {
	System.out.println("pls enter the num1 and num2");
	double num1 = scan.nextDouble();
	double num2 = scan.nextDouble();
	System.out.println("The Addition is "+(num1+num2));
	}
	public void sub() {
		System.out.println("pls enter the num1 and num2");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		System.out.println("The Subtraction is "+(num1-num2));
		}
	public void mul() {
		System.out.println("pls enter the num1 and num2");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		System.out.println("The Multiplication is "+(num1*num2));
	}
	public void div() {
		System.out.println("pls enter the num1 and num2");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		System.out.println("The Division is "+(num1/num2));
		}
	public void mod() {
		System.out.println("pls enter the num1 and num2");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		System.out.println("The remainder is "+(num1%num2));
		}
	public void Pow() {
		System.out.println("pls enter the num1 ");
		double num1 = scan.nextDouble();
		//double num2 = scan.nextDouble();
		System.out.println("The Power is "+(num1*num1));
		}
}

	
