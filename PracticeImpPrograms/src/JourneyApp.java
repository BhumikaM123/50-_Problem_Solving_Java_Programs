import java.util.Scanner;
public class JourneyApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("pls enter the speed and time");
		double speed = scan.nextDouble();
		double time = scan.nextDouble();
		JourneyCalculator j1 = new JourneyCalculator();
		double result = j1.calculateDistance(speed,time);
		System.out.printf("%.2f",result);
	
scan.close();
}
}