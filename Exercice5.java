package exercices2;

import java.util.Scanner;

/**
	 * Écrire un programme permettant de remplir un tableau de 5 éléments, ensuite calcule et
	 * affiche la somme des éléments de ce tableau.
	 * @author thibault
	 */

public class Exercice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tab = new int[5];
		int result = 0;
		for (int i = 0; i < tab.length; i++) {
			System.out.println("Veuillez saisir un "+(i+1)+" nombre.");
			tab[i] = sc.nextInt();
		}
		for (int i = 0; i < tab.length; i++) {
			result += tab[i];
		}
		System.out.println("La somme de tout vos nombres saisi est "+result);
		sc.close();
	}

}
