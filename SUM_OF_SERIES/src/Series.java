import java.util.Scanner;
public class Series {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number to find their sum of series");
	int n = scan.nextInt();
	calculateSumOfSeries(n);
	scan.close();
}
public static void calculateSumOfSeries(int n) {
	double k=0.0;
	for(int i=1;i<=n;i++) {
		k+=1.0/i;
	}
	//int res = k+1;

System.out.println("The sum of series of"+" "+n+" "+"is"+" "+k);
}
}