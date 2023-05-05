package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci una parola: ");
		String str = sc.nextLine(); 
		sc.close();

		int strLng = str.length();
		for (int x=0;x<strLng/2;x++) {
			
			int revInd = strLng - x - 1;
			if (str.charAt(x) != str.charAt(revInd)) {
				
				System.out.println("non e' palindroma");
				return;
			}
		}

		System.out.println("e' palindroma");

	}
}

//		Scanner in = new Scanner(System.in);
//		System.out.println("Inserire una parola: ");
//		String parola = in.nextLine();
//		
//		String parolaInv = new StringBuilder(parola).reverse().toString();
//		
//		if ( parola.equals(parolaInv)) {
//			System.out.println("La parola è palindroma");
//		} else {
//			System.out.println("La parola non è palindroma");
//		}	