package org.lessons.java;

public class Snack3 {
	public static void main(String[] args) {
		int[] numeri = { 4,2,3,7,5,8,9,1,6 };
		
		int somma = 0;
		for( int i = 0; i < numeri.length; i++) {
			
			if ( i % 2 == 0) {
				somma += numeri[i];
			}
		}
		
		System.out.println(somma);
	}
}
