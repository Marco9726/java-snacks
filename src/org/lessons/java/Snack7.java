package org.lessons.java;

import java.util.Random;

public class Snack7 {
	public static void main(String[] args) {
		
		int numero = 1;
		
		Random r = new Random();
		
		while ( numero % 3 != 0 || numero % 5 != 0) {
			
			int randomNum = r.nextInt(100-0) + 0;
			
			System.out.println(randomNum);
			
			numero = randomNum;
		}
	}
}
