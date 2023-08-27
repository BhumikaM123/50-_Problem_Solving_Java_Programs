
public class Armstrong_Checker {
	public static int armstrong(int num) {
		int sum=0;
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		return count;
		

	}
}
