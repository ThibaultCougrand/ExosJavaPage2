package exercices2;

import java.util.Scanner;

/**
	 * Ecrire une fonction calculant le Nième élément de la suite fibonacci.
	 * @author thibault
	 */

public class Exercice4 {

	public static int fibonacci(int nb) {
		int fibo = 0;
		int fiboA = 0;
		int fiboB = 1;
		for (int i = 1; i <= nb; i++) {
			fibo = fiboA + fiboB;
			System.out.println("suite" + i + "=" + fiboA + "+" + fiboB + "=" + fibo);
			fiboA = fiboB;
			fiboB = fibo;
		}
		return fibo;
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nb = sc.nextInt();
		System.out.println("le "+nb+"eme élément de la liste fibonacci est "+fibonacci(nb));
		sc.close();
	}

}
