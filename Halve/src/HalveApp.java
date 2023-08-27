import java.util.Scanner;
public class HalveApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the amount to be halved");
	double num = scan.nextDouble();
	if(num>=0 && num<=10e9) {
	System.out.printf("The halved amount of your entire amount is %.2f",HalveProblem.halveTheNumber(num));
	scan.close();
}else {
	System.out.println("sorry,enter the valid amount!!there is a range");
}
}
}