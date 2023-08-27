package com.kodnest.loops;
import java.util.Scanner;
public class DoWhile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean board = true;
		int i=1;
		do {
			System.out.println("reading the book "+ " "+i+" "+"page");
			i++;
			System.out.println("do u want to continue??");
		board = scan.nextBoolean();
		}while(board);
		scan.close();
	}

}
