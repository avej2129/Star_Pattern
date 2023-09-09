package com.gl.StarPattern;

import java.util.Scanner;

public class DiamondStarPattern { // Straight and reverse pyramid

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number --> ");
		int Number = sc.nextInt();
		System.out.println("Printed Pyramid Pattern Which Having " + Number + " Rows");
		System.out.println();
		for (int i = 1; i <= Number; i++) {
			for (int k = i; k <= Number - 1; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		for (int i = 1; i <= Number - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= Number - 1 - i; k++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}
}
