import java.util.Scanner;
public class Natural_Number {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of natural number N value to find the sum");
		int n = scan.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("The sum of "+n+" "+"natural numbers is"+" "+sum);
	scan.close();
}
}
