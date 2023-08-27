package practice2;
import java.util.Scanner;

public class StudentApp {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("pls enter ur id");
		s1.id = scan.nextInt();
		s1.revise();
		//s1.id=2;
		//s1.name="Bhumika";
		//s1.subject="java";
		//t1.read();
		System.out.println("pls enter ur name");
		scan.nextLine();
		s1.name = scan.nextLine();
		s1.write();
		//t1.write();
		System.out.println("pls enter ur revision subject");
		s1.subject = scan.nextLine();
		//t1.read();
		s1.read();
		scan.close();
	}
}
