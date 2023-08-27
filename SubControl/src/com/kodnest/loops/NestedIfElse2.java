package com.kodnest.loops;
import java.util.Scanner;
public class NestedIfElse2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the score");
		int score = scan.nextInt();

	    if (score >= 90) {
	        System.out.println("Excellent performance! You achieved an A grade.");
	    } else {
	        if (score >= 80) {
	            System.out.println("Good job! You achieved a B grade.");
	        } else {
	            System.out.println("Keep up the effort! Your grade is C or lower.");
	        }
	    }
	}

}
