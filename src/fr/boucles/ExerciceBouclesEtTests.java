package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		
		// Variable String utilisé pour l'affichage des étapes du programme 
		String messageAffiche;
		// Declaration du tableau array
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		// Affichage du tableau grace a une boucle FOR
		messageAffiche = "**** Affichage des elements du tableau ****";
		System.out.println(messageAffiche);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
		// Affichage du tableau dans l'ordre inverse
		messageAffiche = "**** Affichage dans l'ordre inverse des elements du tableau ****";
		System.out.println(messageAffiche);
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
		// Afficher les elements superieur a 3 dans le tableau
		messageAffiche = "**** Affichage des elements superieur à 3 du tableau ****";
		System.out.println(messageAffiche);
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 3) {
				System.out.print(array[i] + "\t");
			}
		}
		System.out.println();
		// Afficher les elements pairs du tableau
		messageAffiche = "**** Affichage des elements pairs du tableau ****";
		System.out.println(messageAffiche);
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + "\t");
			}
		}
		System.out.println();
		
		// Afficher les elements avec un index pair 
		messageAffiche = "**** Affichage des elements avec index pair du tableau ****";
		System.out.println(messageAffiche);
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				System.out.print(array[i] + "\t");
			}
		}
		System.out.println();
		
		// Afficher les elements impairs du tableau
		messageAffiche = "**** Affichage des elements impairs du tableau ****";
		System.out.println(messageAffiche);
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				System.out.print(array[i] + "\t");
			}
		}
		System.out.println();

	}

}
