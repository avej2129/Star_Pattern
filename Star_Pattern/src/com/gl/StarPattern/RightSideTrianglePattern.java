package com.gl.StarPattern;

import java.util.Scanner;

public class RightSideTrianglePattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number --> ");
		int Number = sc.nextInt();
		System.out.println("Printed Right Side Triangle Pattern Which Having " + Number + " Rows");
		System.out.println();
		for (int i = 1; i <= Number; i++) {
			for (int k = i; k <= Number - 1; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
