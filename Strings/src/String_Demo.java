import java.util.Scanner;
public class String_Demo {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	StringBuilder s = new StringBuilder("Raja");
	System.out.println(s);
	System.out.println(s.reverse());
	char ch[]= new char[10];
	System.out.println("Enter the characters");
	for(int i=0;i<=ch.length-1;i++) {
		ch[i]=scan.nextLine().charAt(0);
	}
	System.out.println("The first array are..............");
	System.out.println();
	//System.out.println("------------------------------------");
	for(int i=0;i<=ch.length-1;i++) {
		System.out.print(ch[i]);
		
	}
	
	System.out.println();
	char ch1[]= new char[ch.length];
	for(int i=0;i<=ch.length-1;i++) {
		ch1[i]=ch[i];
	}
	System.out.println();
	System.out.println("The second array are..................");
	//System.out.println("=========================================");
	for(char c:ch1) {
		System.out.print(c);
	}
	System.out.println();
	char ch2[]= new char[ch.length];
	System.out.println();
	System.out.println("The third array are.....................");
	for(int i=ch.length-1;i>=0;i--) {
		ch2[i]=ch1[i];
	}
	for(int i=ch.length-1;i>=0;i--) {
		System.out.print(ch2[i]);
	}
	scan.close();
	
}
}
