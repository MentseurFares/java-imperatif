package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		int entierSaisie;
		boolean condition ; 
		do {
			System.out.print("Entrer un entier entre 1 et 10 : ");
			Scanner scan = new Scanner(System.in);
			entierSaisie = scan.nextInt();
			condition = entierSaisie >= 1 && entierSaisie <= 10;
		} while (!condition);
		System.out.println(entierSaisie+"\nMerci !");
	}

}
