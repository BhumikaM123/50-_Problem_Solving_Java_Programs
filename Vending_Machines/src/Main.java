
import java.util.Scanner;

public class Main {

public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
do {

System.out.println("Enter Product Code p01 or p02 or p03 or else u get jira");

String code=scan.next();

getProduct(code);

}while(true);

}

public static void getProduct(String productCode)

{

switch(productCode)

{

case "p01":System.out.println("COCA COLA");

break;

case "p02":System.out.println("THUMPS UP");

break;

case "p03":System.out.println("Sprite");

break;

default:System.out.println("BINDU JAL JEERA....");

}

}

}