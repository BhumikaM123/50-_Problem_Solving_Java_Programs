import java.util.Scanner;
public class SquaresApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("pls enter the score to level up");
		int num = scan.nextInt();
		System.out.println("The leveling up score is"+" "+Squares.squareNumber(num));
		
scan.close();
}
}