import java.util.Scanner;
public class MarksApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("pls enter ur all sem marks sem 1 to sem 8");
		int sem1 =scan.nextInt();
		int sem2 =scan.nextInt();
		int sem3 =scan.nextInt();
		int sem4 =scan.nextInt();
		int sem5 =scan.nextInt();
		int sem6 =scan.nextInt();
		int sem7 =scan.nextInt();
		int sem8 =scan.nextInt();
		//AverageCalculator a1 = new AverageCalculator();
		double result = AverageCalculator.calculateAverage(sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8);
		System.out.printf("The average marks are"+" "+"%.2f",result);
		
		scan.close();
	}

}
