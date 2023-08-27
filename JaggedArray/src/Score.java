import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of games");
		int [][]arr = new int[scan.nextInt()][];
		for(int i=0;i<=arr.length-1;i++) {
			 System.out.println("enter the number of players of game"+" "+i);
			 arr[i] = new int[scan.nextInt()];
		}
		for(int i=0;i<=arr.length-1;i++) {
			
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("enter the score of player"+" "+j+" "+"in game"+" "+i);
				arr[i][j]=scan.nextInt();
				
			}
		}
		System.out.println("The scores of each game players are.....");
		for(int i=0;i<=arr.length-1;i++) {
			
			for(int j=0;j<=arr[i].length-1;j++) {
				
			System.out.println("Game"+" " +i+" "+"="+" "+"player"+" "+j+" "+"score is"+" "+arr[i][j]+"  ");
				
			}
			System.out.println();
		}
		scan.close();
	}
}
