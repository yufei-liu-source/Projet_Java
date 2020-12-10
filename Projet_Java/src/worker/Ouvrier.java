package worker;

public class Ouvrier extends Personne {

	private String specialite;
	private final int salaire = 5;
	
	public Ouvrier(int identifiant, String nom, String prenom, String specialite) {
		super(identifiant, nom, prenom);
		this.specialite = specialite;
		// TODO Auto-generated constructor stub
	}

}
