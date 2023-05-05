package org.lessons.java;

import java.util.Arrays;

public class Snack13 {

	public static void main(String[] args) {
		
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		int arr1Lng = arr1.length;
		int arr2Lng = arr2.length;
		
		Integer[] arr1Copia = new Integer[arr1Lng];
		Integer[] arr2Copia = new Integer[arr2Lng];
		
		for ( int i = 0; i < arr1Lng; i++) {
			if ( i == 0) {
				arr1Copia[i] = arr2[i];
				arr2Copia[i] = arr1[i];
			} else {
				arr1Copia[i] = arr1[i];
				arr2Copia[i] = arr2[i];
			}
		}
		
		System.out.println(Arrays.asList(arr1Copia));
		System.out.println(Arrays.asList(arr2Copia));
	}
}
