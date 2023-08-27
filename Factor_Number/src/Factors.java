import java.util.Scanner;
public class Factors {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of N");
		int n = scan.nextInt();
		System.out.println("The factors are");
		for(int i=1;i<=n;i++) {
			
			if(n%i==0){
				
				//System.out.println("The factors are");
				System.out.print(i+" ");
			}
		}
		
	
scan.close();
}
}
