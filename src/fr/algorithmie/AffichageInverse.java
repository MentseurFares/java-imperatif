package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		
		// Variable utilisé pour rendre l'affichage explicite
		String messageForUser ;
		// Declaration du tableau avec des valeurs definies 
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		// Affichage des elements du tableau
		messageForUser = "Affichage des elements du tableau ";
		System.out.println(messageForUser);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"\t");		
		}
		System.out.println();
		
		// Affichage dans l'ordre inverse du tableau 
		messageForUser = "Affichage dans l'ordre inverse des elements du tableau ";
		System.out.println(messageForUser);
		for (int i = array.length-1; i>=0; i--) {
			System.out.print(array[i]+"\t");
		}
		System.out.println();
		
		// Creation du tableau arrayCopy
		int[] arrayCopy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			arrayCopy[i]=array[i];
		}
		
		// Affichage de arrayCopy
		messageForUser = "Affichage du tableau arrayCopy";
		System.out.println(messageForUser);
		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.print(arrayCopy[i]+"\t");		
		}
		System.out.println();
	}

}
