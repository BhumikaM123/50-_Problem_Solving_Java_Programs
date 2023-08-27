
public class String_Immutable {
public static void main(String[] args) {
	String s1="Rama";
	System.out.println(s1);
	String s2="Sita";
	System.out.println(s2);
	String s3=s1+s2;
	System.out.println(s3);
	String s5="Rama"+"Sita";
	System.out.println(s5);
	String s4 = s1.concat("Sita");
	System.out.println(s1);
	System.out.println(s4);
}
}
