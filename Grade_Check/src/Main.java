import java.util.Scanner;
public class Main {
	public static void checkGrade(int grade) {
		if(grade>=50) {
			System.out.println("PASS (Congragulations!!!)");
		}else {
			System.out.println("FAIL (dont give up)");
		}
	}

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Pls enter your grade");
	int grade = scan.nextInt();
	checkGrade(grade);
	scan.close();
}
}
