import java.util.Scanner;
public class DoublingApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("pls enter the number which will increase your score under conditions");
		int num = scan.nextInt();
		System.out.println("the updated score is"+" "+DoubleTrouble.d_2oubleTheNumber(num));
		scan.close();
	}

}
