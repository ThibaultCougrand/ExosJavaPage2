package exercices2;

import java.util.Scanner;

/**
	 * Écrire une fonction permettant de calculer le factoriel d’un entier saisi au clavier.
	 * @author thibault
	 */

public class Exercice3 {
	
	public static long factoriel(int saisi) {
		long fact = 1;
		for (int i = 1; i <= saisi; i++) {
			fact *= i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre à factoriser.");
		int saisi = sc.nextInt();
		System.out.println("Le factoriel de "+saisi+" est : "+factoriel(saisi));
		sc.close();
	}

}
