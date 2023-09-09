package com.gl.StarPattern;

import java.util.Scanner;

public class DesignPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The How much Row You Want --> ");
		int Number = sc.nextInt();
		System.out.println("Printed Design Pattern Which Having " + Number + " Rows");
		System.out.println();
		for (int a = 0; a <= 3; a++) {
			for (int i = 0; i <= Number; i++) {
				for (int j = i; j <= Number - 1; j++) {
					System.out.print(" *");
				}
				System.out.println();
			}
			for (int k = 0; k <= Number; k++) {
				for (int p = 0; p <= k; p++) {
					System.out.print(" *");
				}
				System.out.println();
			}
		}
	}
}