import java.util.Scanner;
public class PersonApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the id pls");
	int id=scan.nextInt();
	System.out.println("enter the name pls");
	scan.nextLine();
	String name=scan.nextLine();
	System.out.println("enter the gender pls");
	String gender=scan.next();
	System.out.println("enter the emailid pls");
	String emailid=scan.next();
	System.out.println("enter the phono pls");
	long phno=scan.nextLong();
	Person p = new Person(id,name,gender,emailid,phno);
	System.out.println(p.id +"  "+p.name+"   "+p.gender+"   "+p.emailid+"  "+p.phno);
	scan.close();
	p.eat();
}
}
