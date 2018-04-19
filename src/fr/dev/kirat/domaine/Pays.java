package fr.dev.kirat.domaine;

public class Pays {

	// attribut

	private int idPays;
	private String nom;
	private String continent;
	private long population;


	// Constructeur

	public Pays(int idPays, String nom, String continent, long population) {
		super();
		this.idPays = idPays;
		this.nom = nom;
		this.continent = continent;
		this.population = population;
		
	
	}
	

	public Pays() {
		super();
	}

	// Get and Set

	public int getIdPays() {
		return idPays;
	}

	public void setIdPays(int idPays) {
		this.idPays = idPays;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Pays [idPays=" + idPays + ", nom=" + nom + ", continent=" + continent + ", population=" + population
				+ "]";
	}
	

}
