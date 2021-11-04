package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 }; // Declaration du tableau array
		float moyenne = 0.0f;  // pour contenir la moyenne du tableau 
		
		// Calculer la moyenne en faisant une somme de tous les elements du tableau et
		// diviser par la taille du tableau à la fin
		for (int i = 0; i < array.length; i++) {
			moyenne += array[i];
		}
		moyenne /= array.length;
		System.out.println("Moyenne tableau : "+moyenne);
	}
}
