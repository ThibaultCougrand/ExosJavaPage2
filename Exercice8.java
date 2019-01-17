package exercices2;

import java.util.Scanner;

/**
	 * Écrire un programme qui affiche un triangle isocèle formé d’étoiles. La hauteur du triangle
	 * (c’est-à-dire son nombre de lignes) sera fournie en donnée, comme dans l’exemple ci-
	 * dessous.
	 * On s’arrangera pour que la dernière ligne du triangle s’affiche sur le bord gauche de l’écran.
	 * @author thibault
	 */
	
public class Exercice8 {
	public static void carre() {
		System.out.println("Veuillez saisir un nombre de lignes pour faire un carré.");
		Scanner sc = new Scanner(System.in);
		int nbLignes = sc.nextInt();
		int nbColones = 1+2*nbLignes-2;
		String[][] tab = new String[nbLignes][nbColones];
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				tab[i][j] = "*";
				System.out.print(tab[i][j]);
			}
			System.out.println("");
		}
	}
	public static void triangle() {
		System.out.println("Veuillez saisir un nombre de lignes pour faire un triangle.");
		Scanner sc = new Scanner(System.in);
		int nbLignes = sc.nextInt();
		int nbColones = 1+2*nbLignes-2;
		String[][] tab = new String[nbLignes][nbColones];
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (j < nbColones/2-i || j > nbColones/2+i) {
					tab[i][j] = " ";
				} else {
					tab[i][j] = "*";
				}
				System.out.print(tab[i][j]);
			}
			System.out.println("");
		}
	}
	public static void rond() {
		System.out.println("Veuillez saisir un nombre de lignes pour faire un rond.");
		Scanner sc = new Scanner(System.in);
		int nbLignes = sc.nextInt()/2;
		int nbColones = (1+2*nbLignes-2)*2;
		String[][] tab = new String[nbLignes][nbColones];
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (j < nbColones/2-i || j > nbColones/2+i) {
					tab[i][j] = " ";
				} else {
					tab[i][j] = "*";
				}
				System.out.print(tab[i][j]);
			}
			System.out.println("");
		}
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (j < nbColones/2-i || j > nbColones/2+i) {
					tab[i][j] = " ";
				} else {
					tab[i][j] = "*";
				}
				System.out.print(tab[i][j]);
			}
			System.out.println("");
		}
	}
	public static void etoile() {
		System.out.println("Veuillez saisir un nombre de lignes pour faire une étoile.");
		Scanner sc = new Scanner(System.in);
		int nbLignes = sc.nextInt();
		int nbColones = 1+2*nbLignes-2;
		int difference = nbLignes/3;
		String[][] tab = new String[nbLignes+difference][nbColones];
		for (int i = 0; i < tab.length-difference; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (j < nbColones/2-i || j > nbColones/2+i) {
					tab[i][j] = " ";
				} else {
					tab[i][j] = "*";
				}
			}
		}
		for (int i = difference; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (tab[i][j] == "*") {
				} else if (j < i-difference || j > nbColones-i+difference-1) {
					tab[i][j] = " ";
				} else {
					tab[i][j] = "*";
				}
			}
		}
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				System.out.print(tab[i][j]);
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		//rond();
		carre();
		triangle();
		etoile();
	}

}
