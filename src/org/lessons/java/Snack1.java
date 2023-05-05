package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserire un numero: ");
		
		int num = in.nextInt();
		
		in.close();
		
		if ( num % 2 == 0) {
			System.out.println(num);
		} else {
			System.out.println(++num);
		}
	}
}
