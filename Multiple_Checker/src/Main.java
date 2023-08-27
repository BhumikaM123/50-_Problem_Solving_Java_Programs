import java.util.Scanner;
public class Main {
	public static void CheckMultipleOfTen(int n) {
		if(n%10 == 0) {
			System.out.println(n+" "+"is multiple of Ten");
		}else {
			System.out.println(n+" "+"is not multiple of 10");
		}
	}

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Pls enter the number");
	int n = scan.nextInt();
	CheckMultipleOfTen(n);
	scan.close();
}
}

