import java.util.Scanner;
public class Array2d {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float [][]arr = new float[4][3];
		for(int i=0;i<=arr.length-1;i++) {
			
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("enter the height of"+" "+i+"th "+"game player"+" "+j);
				arr[i][j]=scan.nextFloat();
				
			}
		}
		System.out.println("The heights of each game players are.....");
		for(int i=0;i<=arr.length-1;i++) {
			
			for(int j=0;j<=arr[i].length-1;j++) {
				
			System.out.print(arr[i][j]+"  ");
				
			}
			System.out.println();
		}
		scan.close();
	}

}
