package com.gl.StarPattern;

import java.util.Scanner;

public class SandGlassStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of Rows You Want :- ");
		int Number = sc.nextInt();

		for (int i = 1; i <= Number; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= Number; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int p = 1; p <= Number; p++) {
			for (int q = p; q <= Number - 1; q++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= p; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
