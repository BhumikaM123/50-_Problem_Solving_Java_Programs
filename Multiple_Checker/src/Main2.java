//if user to check multiple of specific number
//input---> specific number and which multiple to check
import java.util.Scanner;
public class Main2 {
	public static void CheckMultipleOfTen(int n,int m) {
		if(n%m == 0) {
			System.out.println(n+" "+"is multiple of "+m);
		}else {
			System.out.println(n+" "+"is not multiple of "+m);
		}
	}

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Pls enter the number to know its their multiple or not");
	int n = scan.nextInt();
	int m = scan.nextInt();
	CheckMultipleOfTen(n,m);
	scan.close();
}
}


