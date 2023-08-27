import java.util.Scanner;
public class Sports {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the sportsman height in inches");
	double inches = scan.nextDouble();
	if(inches>=0 && inches<=10e9) {
	HeightConvertor h1 = new HeightConvertor();
	System.out.printf("The sportsman have %.2f feet",h1.convertInchesToFeet(inches));
	//System.out.printf("The sportsman have"+ "  %.2f feet",h1.convertInchesToFeet(inches));
	scan.close();
}else
{
	System.out.println("enter the valid inches");
}
}
}