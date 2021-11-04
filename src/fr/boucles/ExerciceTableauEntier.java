package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		
		// Declaration du tableau avec valeur par defaut
		int[] intTab = new int[10];
		// Remplissage du tableau a l'aide d'une boucle
		for (int i = 0; i < intTab.length; i++) {
			intTab[i] = i + 1;
		}
		// Affichage du premier element
		System.out.println("1st element of intTab : " + intTab[0]);
		// Affichage de la taille du tableau
		System.out.println("intTab size : " + intTab.length);
		// Affichage du dernier element du tableau 
		System.out.println("Last element of intTab : " + intTab[intTab.length - 1]);
		// Affichage complet du tableau avant modification
		for (int i = 0; i < intTab.length; i++) {
			System.out.print(intTab[i]+"\t");	
		}
		System.out.println();
		// Modification du cinquieme element du tableau
		intTab[4] = 8;
		// Affichage complet apres modifcation	
		for (int i = 0; i < intTab.length; i++) {
			System.out.print(intTab[i]+"\t");	
		}
	}

}
