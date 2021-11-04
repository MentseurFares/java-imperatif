package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {

		// Affichage des chiffres de 1 a 10
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();

		// Affichage 20 fois nom et prenom
		String firstName = "Fares";
		String lastName = "MENTSEUR";
		for (int i = 0; i < 20; i++) {
			System.out.println(firstName + " " + lastName);
		}

		// Affichage des chiffres pairs avec test
		for (int i = 2; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// Affichage des chiffre pairs avec incrementation
		for (int i = 2; i <= 100; i += 2) {
			System.out.println(i);
		}
		
		// Affichage des chiffres impairs avec test
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		
		// Affichage des chiffres impairs avec incrementation
		for (int i = 1; i < 100; i += 2) {
			System.out.println(i);
		}
		
	}
}
