package com.gl.StarPattern;

import java.util.Scanner;

public class PyramidSquarePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number --> ");
		int Number = sc.nextInt();

		System.out.println("Printed Pyramid Square Pattern Which Having " + Number + " Rows");
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
		for (int k = 1; k <= Number; k++) {
			for (int p = 1; p <= Number; p++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
