package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {

		int[] tab1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] tab2 = { -1, 12, 17, 14, 5, -9, 0, 18 };
		int maxTabSize;

		// Calcul de la taille du nouveau tableau qui sera egale à la taille du grand
		// tableau
		if (tab1.length >= tab2.length) {
			maxTabSize = tab1.length;
		} else {
			maxTabSize = tab2.length;
		}

		// declaration du tableau resultant
		int[] tabAddition = new int[maxTabSize];

		// remplissage du tableau
		// on cherche dans le tableau si on a pas dépassé sa taille
		for (int i = 0; i < maxTabSize; i++) {
			if (tab1.length > i) {
				tabAddition[i] += tab1[i];
			}
			if (tab2.length > i) {
				tabAddition[i] += tab2[i];
			}

		}

		// affichage du tab 1
		System.out.println("tab1 : ");
		for (int i = 0; i < tab1.length; i++) {
			System.out.print(tab1[i] + "\t");
		}
		System.out.println();

		// affichage du tab 2
		System.out.println("tab2 : ");
		for (int i = 0; i < tab2.length; i++) {
			System.out.print(tab2[i] + "\t");
		}
		System.out.println();

		// affichage du tabAddition
		System.out.println("tab1 + tab2 : ");
		for (int i = 0; i < tabAddition.length; i++) {
			System.out.print(tabAddition[i] + "\t");
		}
		System.out.println();

	}
}
