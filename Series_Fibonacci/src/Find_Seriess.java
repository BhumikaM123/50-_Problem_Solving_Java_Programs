public class Find_Seriess {
public static void Find_Serie(int n) {
	if(n==1) {
		System.out.println("The Fibonacci Series of number 1 is 0");
	}else if(n==2) {
		System.out.println("The Fibonacci Series of number 2 is 0  1");
	}else {
		System.out.println("The Fibonacci series of"+" "+n+" "
	+"is");
		System.out.print("0"+"  "+"1 ");
		int fib1=0;
		int fib2=1;
		for(int i=0;i<n-2;i++) {
			int next_No = fib1+fib2;
			fib1=fib2;
			fib2=next_No;
			
			System.out.print("  "+next_No+" ");
		}
	}
}
}


