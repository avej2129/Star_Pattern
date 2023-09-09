package com.gl.StarPattern;

public class Reversepyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Number = 5;

		for (int i = 0; i <= Number - 1; i++) {
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
