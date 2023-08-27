package com.kodnest.loops;
import java.util.Scanner;
public class NestedIfElse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the age range 0-100");
		int age = scan.nextInt();
		if (age >= 18) {
		    if (age < 21) {
		        System.out.println("You are eligible to play rolar coaster.");
		    } else {
		        System.out.println("You are eligible to play rolar coaster and should pay extra fee.");
		    }
		} else {
		    System.out.println("You are not eligible to play rolar coaster.");
		}
		
	}

}
