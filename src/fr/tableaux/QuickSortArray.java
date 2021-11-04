package fr.tableaux;

public class QuickSortArray {
	
	public static void main(String[] args) {
		int[] resultasExamens = { 12, 19, 2, 5, 1, 96, 234, 564, 45, 34, 34, 56 };
		for (int i = 0; i < resultasExamens.length; i++) {
			System.out.print(resultasExamens[i] + "\t");
		}
		triRapide(resultasExamens, 0, resultasExamens.length-1);
		System.out.println();
		for (int i = 0; i < resultasExamens.length; i++) {
			System.out.print(resultasExamens[i] + "\t");
		}
		
	}

	static void echangerElements(int[] t, int m, int n) {
		int temp = t[m];

		t[m] = t[n];
		t[n] = temp;
	}

	static int partition(int[] t, int m, int n) {
		int v = t[m]; // valeur pivot
		int i = m - 1;
		int j = n + 1; // indice final du pivot

		while (true) {
			do {
				j--;
			} while (t[j] > v);
			do {
				i++;
			} while (t[i] < v);
			if (i < j) {
				echangerElements(t, i, j);
			} else {
				return j;
			}
		}
	}

	static void triRapide(int[] t, int m, int n) {
		if (m < n) {
			int p = partition(t, m, n);
			triRapide(t, m, p);
			triRapide(t, p + 1, n);
		}
	}

}
