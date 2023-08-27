import java.util.Scanner;
public class ConvertorApp {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the minutes");
	int minutes = scan.nextInt();
	if(minutes>=0 && minutes<=10e6)
    {
	System.out.printf("The hours which emp spent is %.1f",Convertor.convertToHours(minutes));
	}
	else
	{
		System.out.println("enter the valid minutes");
	}
	
	scan.close();
}
}