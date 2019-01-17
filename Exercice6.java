package exercices2;

import java.util.Scanner;

/**
	 * Écrire un programme JAVA calculant la somme des n premiers termes de la "série
	 * harmonique", c’est-à-dire la somme :
	 * 1 + 1/2 + 1/3 + 1/4 + ..... + 1/n
	 * La valeur de n sera lue en donnée.
	 * @author thibault
	 */

public class Exercice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nb = Integer.parseInt(args[0]);
		double result = 1.0;
		for (int i = 2; i <= nb; i++) {
			System.out.println(result);
			result += 1.0/ i;
		}
		System.out.println("\n"+Math.round(result*10.0)/10.0);
		sc.close();
	}

}
