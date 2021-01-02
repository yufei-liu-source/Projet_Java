package worker;
public class Chef extends Personne {

	private final int salaire = 10;
	private final int competence = 3;
	
	public Chef(int identifiant, String nom, String prenom) {
		super(identifiant, nom, prenom);
		// TODO Auto-generated constructor stub
	}

	public int getSalaire() {
		return salaire;
	}

	public int getCompetence() {
		return competence;
	}
	
}
