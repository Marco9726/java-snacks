package org.lessons.java;

import java.util.Scanner;

public class Snack10 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Inserire valore per il raggio: ");
		int raggio = in.nextInt();
		
		double area = raggio * raggio * 3.14;
		double circonferenza = 2 * raggio * 3.14;
		
		System.out.println(area);
		System.out.println(circonferenza);
		
	}
}
