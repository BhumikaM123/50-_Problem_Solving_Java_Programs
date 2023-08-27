import java.util.Scanner;
public class SphereApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Pls scientist, enter the radius of the sphere");
	double radius = scan.nextDouble();
	NewPlanetExplorer e1 = new NewPlanetExplorer();
	System.out.printf("Hello Scientist, We found area of sphere cheers!!!"+" "+"%.2f",e1.calculateSurfaceArea(radius));
	scan.close();
}
}
