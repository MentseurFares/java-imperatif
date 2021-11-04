package fr.algorithmie;

public class ComparaisonTableau {

	public static void main(String[] args) {
		
		int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		int occurence = 0;
		
		
		// pour chaque valeur du tableau 1 
		// on parcout le tableau 2 et des que y a egalite on sort et on passe à la prochaine valeur du tab2
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if(array1[i] == array2[j]) {
					occurence++;
					System.out.print(array1[i]+"\t");
					break;
				}
			}
		}
		System.out.println("\nnombre d'elements en commun : "+ occurence);
	}

}
