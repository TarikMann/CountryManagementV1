package fr.dev.kirat.metier;

import java.util.ArrayList;
import java.util.List;

import fr.dev.kirat.domaine.Pays;

public class PaysMetier {

	public void peste(List<Pays> LaListeDesPays, int valPays) {

		// la valeur du pays par rapport a la liste Pays
		int valDuPays = valPays - 1;

		// Recuperation de l'objet Pays par rapport a la clé de la liste
		Pays monPays = LaListeDesPays.get(valDuPays);

		long population = monPays.getPopulation();

		System.out.println("- la peste on pert 10% de la population");
		System.out.println("- la population initial : " + population);

		// on lance l'algo de la peste
		long newPopulation = population - (population * 10) / 100;
		monPays.setPopulation(newPopulation);
		System.out.println("----------------------------------");
		System.out.println("- la population initial : " + population + " prs a : " + monPays.getPopulation() + " prs.");
System.out.println("----------------------------------");
	}

	public void tsunami(List<Pays> LaListeDesPays, int valPays) {
		System.out.println("le tsunami on pert 2 000 000 personnes");

		// la valeur du pays par rapport a la liste Pays
		int valDuPays = valPays - 1;

		// Recuperation de l'objet Pays par rapport a la clé de la liste
		Pays monPays = LaListeDesPays.get(valDuPays);

		long population = monPays.getPopulation();

		// on lance l'algo de la peste
		long newPopulation = population - 20000;
		monPays.setPopulation(newPopulation);
		System.out.println("----------------------------------");
		System.out.println("- la population initial : " + population + " prs a : " + monPays.getPopulation() + " prs.");
		System.out.println("----------------------------------");
	}

	public void orgie(List<Pays> LaListeDesPays, int valPays) {
		System.out.println("l'orgie on gagne 4% de population");
		// la valeur du pays par rapport a la liste Pays
		int valDuPays = valPays - 1;

		// Recuperation de l'objet Pays par rapport a la clé de la liste
		Pays monPays = LaListeDesPays.get(valDuPays);

		long population = monPays.getPopulation();

		// on lance l'algo de la peste
		long newPopulation = population +(population * 4) / 100;
		monPays.setPopulation(newPopulation);
		System.out.println("----------------------------------");
		System.out.println("- la population initial : " + population + " prs a : " + monPays.getPopulation() + " prs.");
		System.out.println("----------------------------------");
	}

	public static List<Pays> creationDeLaList() {

		// Creation de la liste
		List<Pays> LaListeDesPays = new ArrayList<Pays>();

		// Instanciation
		Pays france = new Pays(1, "France", "Europe", 46000000);
		Pays chine = new Pays(2, "Japon", "Asie", 31000000);
		Pays cuba = new Pays(3, "Cuba", "Amerique", 46000000);

		// ajout des objets dans la liste
		LaListeDesPays.add(france);
		LaListeDesPays.add(chine);
		LaListeDesPays.add(cuba);

		return LaListeDesPays;
	}

	public void afficherLalisteDesPays(List<Pays> LaListeDesPays) {

		// Creation de la valeur de l'idee du pays que pour l'affichage
		int valListPays = 0;

		for (Pays lePays : LaListeDesPays) {

			// acrementation de la valeur de l'idee du pays que pour l'affichage
			valListPays++;

			System.out.println(valListPays + "-   " + lePays.getNom() + " " + lePays.getPopulation());

		}
	}
}
