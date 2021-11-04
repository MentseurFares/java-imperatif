package fr.declaration.variable;

public class DeclarationApp {

	public static void main(String[] args) {
		
		byte byteVar = 112;
		short shortVar = 2045;
		int intVar = 34567;
		long longVar = 267;
		float floatVar = 3.14f;
		double doubleVar = 6.023d;
		char charVar ='f';
		boolean test = false;
		String strVar = "Ceci est un test";
		String randomString = "Voici le résultat d'un calcul : 1+5 = 6";
		
		System.out.println(byteVar);
		System.out.println(shortVar);
		System.out.println(intVar);
		System.out.println(longVar);
		System.out.println(doubleVar);
		System.out.println(charVar);
		System.out.println(strVar);
		System.out.println(floatVar);
		System.out.println(test);
		System.out.println("randomString = "+randomString);
		// 1st way to add \n
		randomString = "Voici le résultat d'un calcul : \n1+5 = 6";
		System.out.println("new randomString = "+randomString);

	}

}
