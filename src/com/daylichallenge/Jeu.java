package com.daylichallenge;

import java.util.Random;
import java.util.Scanner;

public class Jeu {

	public static void main(String[] args) {

		int resultat1 = 0;
		int resultat2 = 0;
		int key = 0;

		Random rand = new Random();
		int Nbrealeatoire = rand.nextInt(100);

		do {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Veuillez entrez un nombre compris entre 0 et 100");
			int Nbre = scanner.nextInt();

			System.out.println(Nbrealeatoire);
			System.out.println();
			
			if (Nbre == Nbrealeatoire) {
				
				System.out.println("Vous avez gagner");
				break;

			} else {
				
					if (Nbre < Nbrealeatoire) {
						System.out.println("Nombre trop petit");
					} else {
						System.out.println("Nombre trop grand");
					}
					

				key = 2;

				resultat2 = resultat2 + 1;
				int nombrechance = 3 - resultat2;
				System.out.println("Nombre de chance restante est " + nombrechance);
				System.out.println("************************************************");
				
			}

		} while (resultat2 != 3);
		
		

		if (resultat2 == 3) {

			System.out.println(" Ouf Vous avez perdu le nombre correcte est " + Nbrealeatoire);

		} else {
			resultat2 += 1;
			System.out.println(" Félicitation vous avez obtenu la réponse aprés  " + resultat2 + " Tentatives ");
		}

	}

}
