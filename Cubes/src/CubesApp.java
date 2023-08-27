import java.util.Scanner;
public class CubesApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("pls enter the num to make cube");
		int num = scan.nextInt();
		System.out.println("The cubing of num is"+" "+Cubess.cubeNumber(num));
		
scan.close();
}
}

