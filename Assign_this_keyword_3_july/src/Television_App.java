import java.util.Scanner;
public class Television_App {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
System.out.println("enter tv color,prize,inches,brand,warranty,type,weight,"
		+ "manufacure place,age and model");
String tv_color = scan.next();
int tv_prize = scan.nextInt();
int tv_inches = scan.nextInt();
scan.nextLine();
String tv_brand = scan.next();
int tv_warranty = scan.nextInt();
scan.nextLine();
String tv_type = scan.next();
int tv_weight = scan.nextInt();
scan.nextLine();
String tv_manufacture_place = scan.next();
int tv_age = scan.nextInt();
scan.nextLine();
String tv_model = scan.next();
scan.close();
Television t1 = new Television(tv_color,tv_prize,tv_inches,tv_brand,tv_warranty,tv_type,
		 tv_weight,tv_manufacture_place,tv_age,tv_model);
t1.on();
t1.change_channel_tv();
}
}
