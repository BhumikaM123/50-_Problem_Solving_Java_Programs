import java.util.Scanner;
public class StringArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("pls enter the numbers of employess to get");
		System.out.println("to know their names in order of storage");
		int n = scan.nextInt();
		scan.nextLine();
		System.out.println("enter the names pls");
		String arr[] = new String[n];
		for(int i=0;i<=n-1;i++) {
			arr[i]=scan.nextLine();
		}
	System.out.println("The names are:");
	for(int i=0;i<=n-1;i++) {
		System.out.println(arr[i]);
	}
	scan.close();
	}
}

