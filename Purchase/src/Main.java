import java.util.Scanner;

public class Main {
	public static void checkDiscount(double PurchaseAmount) {
		//System.out.println("Enter the amount");
		
		if(PurchaseAmount>=100) {
			System.out.println("Discount is Applicable");
		}else {
			System.out.println("Discount is not applicable");
		}
	}
		
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the amount");
	double PurchaseAmount = scan.nextDouble();
	checkDiscount(PurchaseAmount);
	scan.close();
}
}

