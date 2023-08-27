package practice;
import java.util.Scanner;

public class Calci {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 2 integers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = sum(a,b);
		System.out.println("Add is:" + " " + c);
		int d = sub(a,b);
		System.out.println("Sub is:" + d);
		int e = div(a,b);
		System.out.println("Div is:" + e);
		int f = mul(a,b);
		System.out.println("Mul is:" + f);
		int g = mod(a,b);
		System.out.println("rem is:" + g);
	}

static int sum(int a,int b) {
	int c = a+b;
	return c;
}
static int sub(int a,int b) {
	int d = a-b;
	return d;
}
static int div(int a,int b) {
	int e = a/b;
	return e;
}
static int mul(int a,int b) {
	int f = a*b;
	return f;
}
static int mod(int a,int b) {
	int g = a%b;
	return g;
}
}

