package fr.algorithmie;

public class RechercheMin {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 }; // Declaration tableau array
		int minOfArray; // utilisé pour stocker le maximum

		minOfArray = array[0];
		// Parcourir le tableau avec une supposition que le min est le premier elements
		// et on le remplace a chaque fois qu'on trouve un autre element inferieur
		for (int i = 0; i < array.length; i++) {
			if (minOfArray > array[i]) {
				minOfArray = array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println("\nle plus petit element du tableau : " + minOfArray);
	}

}
