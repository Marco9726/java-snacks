package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class Snack8 {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int evenInd = 0;
		int oddInd = 0;
		Integer[] evenArr = new Integer[10];
		Integer[] oddArr = new Integer[10];

		Random rnd = new Random();
		for (int x=0; x<10; x++) {
			
			int rndVal = r.nextInt(100-0) + 0;
			
			System.out.println(rndVal);
			
			if (rndVal % 2 == 0) { // pair
				
				evenArr[evenInd++] = rndVal;
				
//						pairArr[pairInd] = rndVal;
//						pairInd++;
			} else {
				
				oddArr[oddInd++] = rndVal;
			}
		}
		
		System.out.println(Arrays.asList(evenArr));
		System.out.println(Arrays.asList(oddArr));
//		
//		Integer[] strippedPairArr = new Integer[pairInd];
//		Integer[] strippedOddArr = new Integer[oddInd];
//		for (int x=0;x<pairInd;x++) {
//			
//			int pairVal = pairArr[x];
//			strippedPairArr[x] = pairVal;
//		}
//		for (int x=0;x<oddInd;x++) {
//			
//			int oddVal = oddArr[x];
//			strippedOddArr[x] = oddVal;
//		}
//
//		System.out.println("-----------------------");
//		System.out.println(Arrays.asList(strippedPairArr));
//		System.out.println(Arrays.asList(strippedOddArr));
//		System.out.println("-----------------------");
		
	}
}
