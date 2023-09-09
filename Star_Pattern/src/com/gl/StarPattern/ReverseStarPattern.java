package com.gl.StarPattern;

import java.util.Scanner;

public class ReverseStarPattern {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number -> ");
		int Number = sc.nextInt();
		System.out.println("Printed Reverse Star Pattern Which Having " +Number+ " Rows");
		System.out.println();
		for (int i=0; i<=Number; i++) {
			for (int j=Number; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
