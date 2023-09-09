package com.gl.StarPattern;

import java.util.Scanner;

public class SimpleStarPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number ");
		int Number = sc.nextInt();
		System.out.println("Printed Simple Star Pattern Which Having " + Number + " Rows");
		System.out.println();

		for (int i = 1; i <= Number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
