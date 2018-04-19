package fr.dev.kirat.presentation;

import java.util.List;
import java.util.Scanner;

import fr.dev.kirat.domaine.Pays;
import fr.dev.kirat.metier.PaysMetier;

public class Presentation {

	public static void main(String[] args) {

		// Declaration
		List<Pays> laListeDesPays;
		PaysMetier monPayerMetier;

		// Instanciation
		monPayerMetier = new PaysMetier();

		// Creation de la liste des pays
		laListeDesPays = PaysMetier.creationDeLaList();

		// Depart de mon application
		char reponseMenuPrincipal = 'O';

		while (reponseMenuPrincipal == 'O') {
			// Affichage du menu principal
			System.out.println("// 1- Afficher la liste des pays.");
			System.out.println("// 2- Lancer une catastrophe.");
			System.out.println("// 3- Quitter.");

			// Ouverture du scanner
			Scanner sc = new Scanner(System.in);
			System.out.print("Faire un choix : ");

			// recuperation de la valeur du scanner
			int choixMenuPrincipal = sc.nextInt();

			switch (choixMenuPrincipal) {

				case 1:
					// Si la valeur du scanner est de 1 on affiche la liste
					System.out.println("**************************");
					monPayerMetier.afficherLalisteDesPays(laListeDesPays);
					System.out.println("**************************");
					break;
				case 2:
					// Si la valeur du scanner est de 2 on lance une catastrophe
					System.out.println("**************************");
					System.out.println("On lance une catastrophe");
					System.out.println("**************************");
					monPayerMetier.afficherLalisteDesPays(laListeDesPays);

					System.out.print("Choisir le pays : ");
					int valDuPays = sc.nextInt();
System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println("/// 1- La peste.");
					System.out.println("/// 2- Tsunami.");
					System.out.println("/// 3- Orgie.");
					System.out.println("/// 4- Quitter.");
					System.out.print("/// Choisir la catastrophe : ");
					int choixMenucatastrophe = sc.nextInt();
					switch (choixMenucatastrophe) {
						case 1:
							monPayerMetier.peste(laListeDesPays, valDuPays);
							break;
						case 2:
							monPayerMetier.tsunami(laListeDesPays, valDuPays);
							break;
						case 3:
							monPayerMetier.orgie(laListeDesPays, valDuPays);
							break;
						case 4:
							// Si la valeur du scanner est de 3 on quitte l'application
							System.out.println("au revoir");
							reponseMenuPrincipal = 'N';
							break;
					}

					break;
				case 3:
					// Si la valeur du scanner est de 3 on quitte l'application
					System.out.println("au revoir");
					reponseMenuPrincipal = 'N';
			}

		}
	}

}
