package fr.tableaux;

import java.util.Iterator;

public class TableauManipulations {

	public static void main(String[] args) {

		int min;
		int index;
		boolean sorted = false;
		int[] resultasExamens = { 12, 19, 2, 5, 1, 96, 234, 564, 45, 34, 34, 56 };

		// Affichage contenu tableau
		for (int i = 0; i < resultasExamens.length; i++) {
			System.out.print(resultasExamens[i] + "\t");
		}
		// Trier le tableau
//		for (int i = 0; i < resultasExamens.length; i++) {
//			index = i ;
//			min = resultasExamens[i];
//			for (int j = i+1; j < resultasExamens.length; j++) {
//				if (min > resultasExamens[j]) {
//					min = resultasExamens[j];
//					index =j ;
//				}
//				
//			}
//			if (index != i) {
//				resultasExamens[index] = resultasExamens[i];
//				resultasExamens[i] = min;
//			}
//		}
//		System.out.println();
//		for (int i = 0; i < resultasExamens.length; i++) {
//			System.out.print(resultasExamens[i]+"\t");
//		}

//		for (int i = 0; i < resultasExamens.length; i++) {
//			for (int j = resultasExamens.length - 1; j > i; j--) {
//				if (resultasExamens[j] < resultasExamens[j - 1]) {
//					int intermediateVar = resultasExamens[j];
//					resultasExamens[j] = resultasExamens[j-1];
//					resultasExamens[j-1] = intermediateVar;
//					System.out.println();
//					for (int k = 0; k < resultasExamens.length; k++) {
//						System.out.print(resultasExamens[k]+"\t");
//					}
//				}
//			}
//			
//		}
//		System.out.println();
//		for (int i = 0; i < resultasExamens.length; i++) {
//			System.out.print(resultasExamens[i]+"\t");
//		}
		do {	
			sorted = true;
			for (int i = 0; i < resultasExamens.length - 1; i++) {
				if (resultasExamens[i] > resultasExamens[i+1]) {
					int intermediateVar = resultasExamens[i];
					resultasExamens[i] = resultasExamens[i + 1];
					resultasExamens[i + 1] = intermediateVar;
					sorted = false;
				}				
			}
			System.out.println();
			for (int i = 0; i < resultasExamens.length; i++) {
				System.out.print(resultasExamens[i] + "\t");
			}
		} while (!sorted);
		System.out.println();
		for (int i = 0; i < resultasExamens.length; i++) {
			System.out.print(resultasExamens[i] + "\t");
		}

	}

}
