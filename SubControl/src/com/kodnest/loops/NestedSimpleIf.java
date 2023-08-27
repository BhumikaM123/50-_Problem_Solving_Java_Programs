package com.kodnest.loops;
import java.util.Scanner;
public class NestedSimpleIf {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the temperature below 50");
	int temp = scan.nextInt();
	if(temp<50) {
		System.out.println("pls enter between 30 and 40, if already entered between these its okay!!");
		temp = scan.nextInt();
		if(temp>=30 && temp<=40) {
		System.out.println("its sunny day");
		System.out.println("=====================================================================");
		System.out.println("pls enter above 50");
		temp = scan.nextInt();
				if(temp>=50 && temp<=100) {
					System.out.println("its very hot day");
				}
		}
	}
	scan.close();
}
}
