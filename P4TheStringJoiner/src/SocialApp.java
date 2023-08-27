import java.util.Scanner;
public class SocialApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your first name and last name");
		String str1 = scan.next();
		String str2 = scan.next();
		//StringJoiner s1 = new StringJoiner();
		System.out.println("Your Full Name is"+" "+ StringJoiner.joinStrings(str1,str2));
		
		scan.close();
		
	}

}
