import java.util.Scanner;
public class CalciApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Calci c1 = new Calci();
	while(true) {
	System.out.println("hello,kodenestian welcome to kodnest calci");
	System.out.println("pls enter + ---> Add"
	+ "- ----> Sub"+
	"* ---> Mul"
	+ "/ ---> Div"
	+ "% ----> Mod"
	+ "^ ---> Power"
	+ "!---> Exit");
	char ch = scan.next().charAt(0);
	switch(ch) {
	case '+' :
		c1.add();
		break;
	case '-' :
		c1.sub();
		break;
	case '*' :
		c1.mul();
		break;
	case '/' :
		c1.div();
		break;
	case '%' :
		c1.mod();
		break;
	case '^' :
		c1.Pow();
		break;
	case '!' :
		System.out.println("tata bye bye see youuuuu");
		return;
	default:
		System.out.println("enter the valid choice as given above");
	}
	}
	
}
}