package org.lessons.java;

import java.util.Scanner;

public class Snack11 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Inserire un valore: ");
		int numero = in.nextInt();
		
		for ( int i = 1; i <= numero; i++) {
			if ( numero % i == 0) {
				System.out.println(i);
			}
		}
	}
}
