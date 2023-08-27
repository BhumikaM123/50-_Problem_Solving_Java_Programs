package zebra;
import java.util.Scanner;
import java.lang.String;
public class waste {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	String reverse = reverseStr(str);
	System.out.println(reverse);
	
}
public static String reverseStr(String str) {
	String reve=" ";
	for(int i=0;i<=str.length()-1;i++){
		reve=str.charAt(i)+reve;
		//int ans = scan.nextInt();
	}
	return reve;
	
}

}
