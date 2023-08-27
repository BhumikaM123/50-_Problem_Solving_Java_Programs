
public class Mutable {
	public static void main(String[] args) {
StringBuffer s1 = new StringBuffer();
System.out.println(s1.capacity());
StringBuffer s2 = new StringBuffer("Raja");
System.out.println(s2.capacity());
StringBuffer s3 = new StringBuffer("Raja the great warrior");
System.out.println(s3.capacity());
s3.append("Raja");
System.out.println(s3.capacity());
s3.append("Raja the great warrior");
System.out.println(s3.capacity());

}
}