import java.util.Scanner;
public class Armstrong_App {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a range of number which is armstrong or not");
	int a= scan.nextInt();
	int b= scan.nextInt();
	System.out.println("The numbers range...from"+" "+a+" "+"to"+" "+b);
	for(int i=a;i<=b;i++) {
		int res=Armstrong_Checker.armstrong(i);
		int res1=Arm.armst(res, i);
		//System.out.println("The Armstrong Numbers Range From"+" "+a+" "+"to"+" "+b+" "+"are.....");
		if(res1==i) {
			
			System.out.print(i+" ");
		}
	}
}
}
