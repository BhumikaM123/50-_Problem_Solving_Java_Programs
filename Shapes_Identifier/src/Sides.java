import java.util.Scanner;

public class Sides {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sides;

        do {
            System.out.println("Enter Number Of Sides To Identify the Shape (Enter 0 to exit)");
            sides = scan.nextInt();
           
           /* if (sides == 0) {
                System.out.println("Exiting the program.");
                break;
            }*/

            Sides2.identifyPolygon(sides);

        } while (true);
        
    }
  
}



