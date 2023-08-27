import java.util.Scanner;
public class FinanceApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the principal amount,rate and time");
	double principal = scan.nextDouble();
	double rate = scan.nextDouble();
	double time = scan.nextDouble();
	if((principal>=0 && principal<=10e9) && (rate>=0 && rate<=1) && (time>=1 && time<=10e5)) {
		FinanceCalculator f1 = new FinanceCalculator();
		System.out.printf("The simple Intrest is %.2f",f1.calculateSimpleInterest(principal,rate,time));
		scan.close();
	}
	else
	{
		System.out.println("enter the valid input");
	}
	
}
}
