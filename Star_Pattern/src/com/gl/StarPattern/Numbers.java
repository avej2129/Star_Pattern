package com.gl.StarPattern;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("How Much Number you want to printed : ");
		int Number = sc.nextInt();

		System.out.println("<------------------------------------------->");

		for (int i = 1; i <= 10; i++) {
			for (int j = i; j <= Number; j = j + 10) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
	}
}
