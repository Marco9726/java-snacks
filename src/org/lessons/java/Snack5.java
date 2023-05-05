package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class Snack5 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserire un numero: ");
		
		Random r = new Random();
		
		in.close();
		
		int numero = in.nextInt();
		
		int somma = 0;
		
		int sommaPari = 0;
		
		int sommaDispari = 0;
		
		int quantitàDispari = 0;
		
		double mediaDispari = 0;
		
		int minimo = Integer.MAX_VALUE;
		
		int massimo = Integer.MIN_VALUE;
		
		for ( int i = 0; i < numero; i++) {
			
			
			int randomNum = r.nextInt(100-0) + 0;
			
			if ( randomNum % 2 == 0) {
				sommaPari += randomNum;
			} else {
				sommaDispari += randomNum;
				quantitàDispari++;
			}
			
			if ( randomNum > massimo) {
				massimo = randomNum ;
			}
			
			if ( randomNum < minimo) {
				minimo = randomNum;
			}
			
			System.out.println(randomNum);
			
			somma += randomNum;
		}
		
		System.out.println("La somma dei valori è: " + somma);
		System.out.println("La somma dei valori pari è: " + sommaPari);
		
		double mediaValori = somma / numero;
		
		System.out.println("La media dei valori è: " + mediaValori);
		
		
		if ( quantitàDispari > 0) {
			mediaDispari = sommaDispari / quantitàDispari;
		}
		
		
		System.out.println("La media dei valori dispari è: " + mediaDispari);
		
		System.out.println("Il valore minimo è: " + minimo);
		
		System.out.println("Il valore massimo è: " + massimo);
	}
}
