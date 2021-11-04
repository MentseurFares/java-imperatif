package fr.algorithmie;

public class SommeDeTableaux {
	public static void main(String[] args) {
		
		int[] tab1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] tab2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
		
		// Affichage tab1 
		System.out.println("tab1 : ");
		for (int i = 0; i < tab1.length; i++) {
			System.out.print(tab1[i]+"\t");
		}
		System.out.println();
		
		// Affichage tab2
		System.out.println("tab2 : ");
		for (int i = 0; i < tab2.length; i++) {
			System.out.print(tab2[i]+"\t");
		}
		System.out.println();
		
		
		// tester la taille des deux tableaux pour eviter les exception :D
		if(tab1.length == tab2.length) {
			int sizeTab = tab1.length;
			int[] tabAddition = new int[sizeTab];
			for (int i = 0; i < sizeTab; i++) {
				tabAddition[i] = tab1[i] + tab2[i];
			}
			// Affichage tabAddition 
			System.out.println("tab1 + tab2 : ");
			for (int i = 0; i < sizeTab; i++) {
				System.out.print(tabAddition[i]+"\t");
			}
			System.out.println();			
		}else {
			System.out.println("ERROR : impossible d'additionner deux tableaux de tailles différentes !");
		}
		
	}
}
