package fr.algorithmie;

import java.util.Iterator;

public class Rotation {

	public static void main(String[] args) {
		// Declaration d'un tableau pour les tests
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int sizeArray = array.length;

		// Affichage du tableau array
		System.out.println("array : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();

		// Rotation du tableau en conservant la derniere valeur 
		int bufferVar = array[array.length-1];
		for (int i = array.length-1; i > 0 ; i--) {			
			array[i] = array[i-1];
		}
		array[0]= bufferVar;

		// Affichage du tableau array avec une rotation a droite
		System.out.println("array : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();

	}
}
