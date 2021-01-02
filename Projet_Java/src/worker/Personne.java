package worker;


public class Personne {

	private int identifiant;
	private String nom;
	private String prenom;
	boolean active;
	
	
	public Personne(int identifiant, String nom, String prenom) {
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.active = false;
	}
	
	public boolean beActive() {
		return this.active = true;
	}
	
	
}
