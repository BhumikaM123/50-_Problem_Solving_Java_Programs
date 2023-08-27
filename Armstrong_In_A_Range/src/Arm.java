
public class Arm {
	public static int armst(int count,int num) {
		int sum=0;
	while(num!=0) {
		int access=num%10;
		int res=(int)Math.pow(access, count);
		sum=sum+res;
		num=num/10;
	}
	return sum;
	
	
	}
}
