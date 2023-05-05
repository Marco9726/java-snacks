package org.lessons.java;

import java.util.Random;
import java.util.Scanner;


public class Snack6 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserire un numero: ");
		
		Random r = new Random();
		
		int numeroLimite = in.nextInt();
		
		int somma = 0;
		
		while ( numeroLimite > somma ) {
			
			int randomNum = r.nextInt(100-0) + 0;
			
			System.out.println(randomNum);
			
			somma += randomNum;
		}
		
		System.out.println("Il valore limite è: " + numeroLimite);
		System.out.println("La somma finale: " + somma);
	}
}
