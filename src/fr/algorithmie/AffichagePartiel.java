package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 }; // Declaration tableau array
		String messageForUser; // utilisé pour l'affichage;

		// Afficher l'etat initial du tableau
		messageForUser = "array : ";
		System.out.println(messageForUser);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();

		// Afficher que les elements superieurs à 3
		messageForUser = "elements de array > 3 : ";
		System.out.println(messageForUser);
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 3) {
				System.out.print(array[i] + "\t");
			}
		}
		System.out.println();

		// Afficher que les elements pairs
		messageForUser = "elements de array pair : ";
		System.out.println(messageForUser);
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + "\t");
			}
		}
		System.out.println();
		

		// Afficher que les elements avec index pairs
		messageForUser = "elements de array avec index pair : ";
		System.out.println(messageForUser);
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				System.out.print(array[i] + "\t");
			}
		}
		System.out.println();
		

		// Afficher que les elements impairs
		messageForUser = "elements de array impair : ";
		System.out.println(messageForUser);
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.print(array[i] + "\t");
			}
		}
		System.out.println();


	}

}
