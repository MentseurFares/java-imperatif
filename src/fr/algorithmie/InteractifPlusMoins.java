package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		int min = 1; // minimum du chiffre aleatoire
		int max = 100; // maximum du chiffre aleatoire
		int entierSaisie; // entier saisie par l'utilisateur
		int randomNumber; // nombre utilisé pour le jeux
		randomNumber = (int) (min + Math.random() * (max - min));
		Scanner scan = new Scanner(System.in);
		System.out.println("On va jouer à un jeux, J'ai un chiffre en tête et c'est à vous de le deviner "
				+ "\nCe chiffre est entre " + min + " et " + max );
		int tentatives =0;
		do {
			++tentatives;
			System.out.println("Essai "  +tentatives + " : ");
			entierSaisie = scan.nextInt();
			if (entierSaisie  > randomNumber) {
				System.out.println("Essayer un chiffre plus petit ");
			} else if (entierSaisie  < randomNumber) {
				System.out.println("Essayer un chiffre plus grand ");
			}
		} while (entierSaisie  != randomNumber);
		System.out.println("Bravo vous avez réussi en "+ tentatives + " tentatives");
	}

}
