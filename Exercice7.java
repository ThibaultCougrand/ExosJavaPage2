package exercices2;

import java.util.Scanner;

/**
	 * Écrire un programme qui crée un tableau comportant les valeurs des carrés des n
	 * premiers nombres impairs, la valeur de n étant lue au clavier et qui en affiche les valeurs
	 * @author thibault
	 */

public class Exercice7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int saisi = sc.nextInt();
		int[] tab = new int[saisi];
		int facteur = 1;
		for (int i = 0; i < saisi; i++) {
			tab[i] = facteur*facteur;
			System.out.println(facteur+" à pour carré "+tab[i]);
			facteur+=2;
		}
		sc.close();
	}

}
