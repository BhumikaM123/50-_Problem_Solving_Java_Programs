
public class MineBrain {
	public static void main(String[] args) {
		
	int a = 6,b;
	 a = a++ + ++a;
	 a = a++;// as its assigning so a has no effect
	 b = a++ - ++a;//during this a has effect where its change its value
	 System.out.println(a);
	 System.out.println(b);
	
	
	}
}
