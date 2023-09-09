package com.gl.StarPattern;

import java.util.Scanner;

public class HolloSquarePattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row ");
		int Row = sc.nextInt();
		System.out.println("Printed Hollow Square Star Pattern Which Having " + Row + " Rows");
		System.out.println();
		for (int i = 0; i < Row; i++) {
			for (int j = 0; j < Row; j++) {
				if (i == 0 || i == Row - 1 || j == 0 || j == Row - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}