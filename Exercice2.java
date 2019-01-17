package exercices2;

import java.util.Scanner;

/**
	 * Écrire un programme qui lit un entier au clavier et qui l’affiche verticalement
	 * @author thibault
	 */
public class Exercice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int saisi = sc.nextInt();
		String saisiS = String.valueOf(saisi);
		for (int i = 0; i < saisiS.length(); i++) {
			System.out.println(saisiS.charAt(i));
		}
		sc.close();

	}

}
