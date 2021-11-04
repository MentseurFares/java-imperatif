package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Saisir un chiffre entier : ");
		int entierSaisie = scan.nextInt();
		System.out.println("Les dis chiffre qui suivent le chiffre "+ entierSaisie + " : ");
		for (int i=0; i < 10 ; i++) {
			System.out.println(++entierSaisie);
		}
	}

}
