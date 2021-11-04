package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {

		String messageForUser;
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 }; // Declaration du tableau array
		int[] arrayCopy = new int[array.length]; // Declaration du tableau arrayCopy avec la meme taille que array
		int lastIndex = array.length - 1;
		// Copy des elements de array dans arrayCopy
		for (int i = 0; i < array.length; i++) {
			arrayCopy[i] = array[lastIndex - i];
		}
		// Affichage du tableau array
		messageForUser = "array : ";
		System.out.println(messageForUser);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();

		// Affichage du tableau arrayCopy
		messageForUser = "arrayCopy : ";
		System.out.println(messageForUser);
		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.print(arrayCopy[i] + "\t");
		}
		System.out.println();
	}

}
