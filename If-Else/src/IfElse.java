import java.util.Scanner;
public class IfElse {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter your marks");
	int marks = scan.nextInt();
	if(marks<50) {
		System.out.println("Your awarded C+");
	}else if(marks>=50 && marks<60) {
		System.out.println("Your awarded B");
	}else if(marks>=60 && marks<70) {
		System.out.println("Your awarded B+");
	}else if(marks>=70 && marks<80) {
		System.out.println("Your awarded A");
	}else if(marks>=80 && marks<100){
		System.out.println("Congragulations!! Your awarded A+");
	}else {
		System.out.println("pls enter the marks between the range 0-100");
	}
	scan.close();
}
}
