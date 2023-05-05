package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Inserire una parola: ");
		String parola = in.nextLine();
		
		String parolaInv = new StringBuilder(parola).reverse().toString();
		
		if ( parola.equals(parolaInv)) {
			System.out.println("La parola è palindroma");
		} else {
			System.out.println("La parola non è palindroma");
		}	

	}
}
