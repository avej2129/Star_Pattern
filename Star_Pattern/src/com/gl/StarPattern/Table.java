package com.gl.SampleCode;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("How Much Number you want to printed : ");
		int Table = sc.nextInt();

		System.out.println("<------------------------------------------->");
		 
	 for (int i = 1; i <= Table ; i++) {
		 for (int j = 1; j <= 10  ; j ++) {
			System.out.print(j*i+" ");
		}
		System.out.println();
	}
	}

}
