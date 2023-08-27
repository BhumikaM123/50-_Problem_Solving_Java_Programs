
public class GCD_Finder {
	public  int GCD_Find(int m,int n) {
		while(n!=0) {
			int rem = m % n;
			m=n;
			n=rem;
			
		}
		return m;
	}

}
