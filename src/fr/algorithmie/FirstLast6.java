package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		
		
		// C'est plus simple avec une methode et faire plusieurs appel avec plusieur tableaux :D
		
		int[] array1 = {5,3,5,7,9,4,-23,1};   // un test pour donner un false 
//		int[] array1 = {6,3,5,7,9,4,-23,1};   // un test pour donner un true 
//		int[] array1 = {5,3,5,7,9,4,-23,6};   // un test pour donner un true 
//		int[] array1 = {6,3,5,7,9,4,-23,6};   // un test pour donner un true 
//		int[] array1 = new int[0];			  // un test pour donner un false 
		boolean stateOfArray = false; 
		
		if (array1.length>0 && (array1[0] == 6 || array1[array1.length-1] == 6)) {
			stateOfArray = true;
		}		
		
		if (array1.length > 0) {
			System.out.println("array 1 : ");
			for (int i = 0; i < array1.length; i++) {
				System.out.print(array1[i]+"\t");
			}
			System.out.println();
		}		
		
		System.out.println("array n'est pas vide et son premier ou dernier element vaut 6 : "+ stateOfArray);
	}

}
