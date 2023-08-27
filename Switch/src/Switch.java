import java.util.Scanner;
public class Switch {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the week days please");
	int a = scan.nextInt();
	switch(a)
	{
	
	case 1 :
		System.out.println("its Sunday!!lets party!!");
		break;
	case 2 :
	    System.out.println("its Monday,go to work!!");
	    break;
	case 3 :
		System.out.println("its Tuesday,let it be");
		break;
	case 4 :
		System.out.println("its Wednesday,go girl or boy...");
		break;
	case 5:
		System.out.println("its Thursday,keep it up");
		break;
	case 6:
		System.out.println("its Friday,feel happy weekend coming...");
		break;
	case 7:
		System.out.println("its Saturday,sleeepppp");
		break;
	default:
		System.out.println("plss u r stupid,pls see the above statement");
	}
	
	scan.close();
}
}
