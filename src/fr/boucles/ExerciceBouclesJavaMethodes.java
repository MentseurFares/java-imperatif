package fr.boucles;

public class ExerciceBouclesJavaMethodes {
	
	public static void main(String[] args) {
		ExerciceBouclesJavaMethodes sample = new ExerciceBouclesJavaMethodes();
		// Affichage des chiffres de 1 a 10
		sample.printNumbes();
		sample.printMyName();
		sample.printEvenNumbersWithTest();
		sample.printEvenNumbersWithIncrement();
		sample.printOddNumbersWithTest();
		sample.printOddNumbersWithIncrement();
	}

	private void printOddNumbersWithIncrement() {
		for (int i = 1; i < 100; i += 2) {
			System.out.println(i);
		}
	}

	private void printOddNumbersWithTest() {
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}

	private void printEvenNumbersWithIncrement() {
		for (int i = 2; i <= 100; i += 2) {
			System.out.println(i);
		}
	}

	private void printEvenNumbersWithTest() {
		for (int i = 2; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	private void printMyName() {
		String firstName = "Fares";
		String lastName = "MENTSEUR";
		for (int i = 0; i < 20; i++) {
			System.out.println(firstName + " " + lastName);
		}
	}

	private void printNumbes() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}


}
