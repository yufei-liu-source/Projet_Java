package worker;
public class Chef extends Personne {

	private final int salaire = 10;
	
	public Chef(int identifiant, String nom, String prenom) {
		super(identifiant, nom, prenom);
		// TODO Auto-generated constructor stub
	}

	public int getSalaire() {
		return salaire;
	}
	


}
