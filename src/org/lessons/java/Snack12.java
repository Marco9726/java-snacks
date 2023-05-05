package org.lessons.java;

import java.util.Arrays;

public class Snack12 {
	
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		int arr1Lng = arr1.length;
		int arr2Lng = arr2.length;
		
		Integer[] arr3 = new Integer[arr1Lng + arr2Lng];
		
		int arr3Lng = arr3.length;
		
		for ( int i = 0; i < arr1Lng; i++) {
			arr3[i] = arr1[i];
		}
		
		for ( int i = 0; i < arr2Lng; i++) {
			arr3[arr1Lng + i] = arr2[i];
		}
		
		System.out.println(Arrays.asList(arr3));
	}
}
