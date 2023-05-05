package org.lessons.java;

import java.util.Scanner;

public class Snack9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserire valore per la base: ");
		int base = in.nextInt();
		
		System.out.println("Inserire valore per l'altezza: ");
		int altezza = in.nextInt();
		
		in.close();
		
		int area = base * altezza;
		
		int perimetro = 2 * base + 2 * altezza;
		
		System.out.println(area);
		System.out.println(perimetro);
	}
}
