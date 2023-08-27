import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class Salary {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int salary=scan.nextInt();
		
		char ch=scan.next().charAt(0);
		int hra=(salary/100)*20;
		int da=(salary/100)*50;
		int pf=(salary/100)*11;
		if(ch=='A'){
			int allow=1700;
			int totalSalary=salary+hra+da+allow-pf;
			System.out.println(totalSalary);
		}else if(ch=='B'){
			int allow=1500;
			int totalSalary=salary+hra+da+allow-pf;
			System.out.println(totalSalary);
		}else{
			int allow=1300;
			System.out.println(salary+hra+da+allow-pf);
			
		}

		
	}
}
