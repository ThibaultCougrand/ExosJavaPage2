package exercices2;

import java.util.Scanner;

/**
	 * Écrire un programme qui lit un mot au clavier et qui indique combien de fois sont
	 * présentes chacune des voyelles a, e, i, o, u ou y, que celles-ci soient écrites en
	 * majuscules ou en minuscules
	 * @author thibault
	 */

public class Exercice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tab = new int[6];
		System.out.print("Veuillez entrer un mot :");
		String saisi = sc.nextLine();
		for (int i = 0; i < saisi.length(); i++ ) {
			switch (saisi.substring(i, i+1)) {
			case "a":case "A": tab[0] += 1;
			break;
			case "e":case "E": tab[1] += 1;
			break;
			case "i":case "I": tab[2] += 1;
			break;
			case "o":case "O": tab[3] += 1;
			break;
			case "u":case "U": tab[4] += 1;
			break;
			case "y":case "Y": tab[5] += 1;
			break;
			}
		}
		System.out.println("il y a "+tab[0]+" 'a' dans le mot.");
		System.out.println("il y a "+tab[1]+" 'e' dans le mot.");
		System.out.println("il y a "+tab[2]+" 'i' dans le mot.");
		System.out.println("il y a "+tab[3]+" 'o' dans le mot.");
		System.out.println("il y a "+tab[4]+" 'u' dans le mot.");
		System.out.println("il y a "+tab[5]+" 'y' dans le mot.");
		sc.close();
	}

}
