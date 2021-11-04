package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {

		String messageForUser;
		// Utilisation de la boucle FOR
		messageForUser = "---------------- BOUCLE FOR -----------";
		System.out.println(messageForUser);
		// Affichage des chiffres de 1 a 10
		messageForUser = "Affichage des chiffres entre 1 et 10";
		System.out.println(messageForUser);
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();

		// Affichage des chiffres pairs entre 0 et 10
		messageForUser = "Affichage des chiffres pairs entre 0 et 10";
		System.out.println(messageForUser);
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "\t");
			}
		}
		System.out.println();
		// Affichage des chiffres impairs entre 0 et 10
		messageForUser = "Affichage des chiffres impairs entre 0 et 9";
		System.out.println(messageForUser);
		for (int i = 0; i <= 9; i++) {
			if (i % 2 != 0) {
				System.out.print(i + "\t");
			}
		}
		System.out.println();

		// Utilissation de la boucle WHILE
		messageForUser = "---------------- BOUCLE WHILE -----------";
		System.out.println(messageForUser);
		// Affichage des chiffres de 1 a 10
		messageForUser = "Affichage des chiffres entre 1 et 10";
		System.out.println(messageForUser);
		int i = 1;
		while (i <= 10) {
			System.out.print(i + "\t");
			i++;
		}
		System.out.println();

		// Affichage des chiffres pairs entre 0 et 10
		messageForUser = "Affichage des chiffres pairs entre 0 et 10";
		System.out.println(messageForUser);
		i = 0;
		while (i <= 10) {
			if (i % 2 == 0) {
				System.out.print(i + "\t");
			}
			i++;
		}
		System.out.println();
		// Affichage des chiffres impairs entre 0 et 10
		messageForUser = "Affichage des chiffres impairs entre 0 et 9";
		System.out.println(messageForUser);
		i = 0;
		while (i <= 9) {
			if (i % 2 != 0) {
				System.out.print(i + "\t");
			}
			i++;
		}
		System.out.println();

	}
}
