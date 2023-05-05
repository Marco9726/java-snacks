package org.lessons.java;

public class Snack2 {
	public static void main(String[] args) {
		String[] listaNomi = {
				"nome1",
				"nome2",
				"nome3",
				"nome4"
		};
		
		String[] listaCognomi = {
				"cognome1",
				"cognome2",
				"cognome3",
				"cognome4"
		};
		
		int nomiLng = listaNomi.length;
		
		int cognomiLng = listaCognomi.length;
			
		for ( int i = 0; i < nomiLng; i++) {
			
			double doubleRandomNumber1 = Math.random() * nomiLng;
			
			int randomNumber1 = (int)doubleRandomNumber1;
			
			double doubleRandomNumber2 = Math.random() * cognomiLng;
			
			int randomNumber2 = (int)doubleRandomNumber2;
			
			System.out.println( listaNomi[randomNumber1] + listaCognomi[randomNumber2]);
		}
	}
	
}
