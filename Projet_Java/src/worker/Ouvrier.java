package worker;

public class Ouvrier extends Personne{

	private String specialite;
	private final int salaire = 5;
	

	public Ouvrier(int identifiant, String nom, String prenom, int id, String specialite) {
		super(identifiant, nom, prenom);
		this.specialite = specialite;
	}


	public String getSpecialite() {
		return specialite;
	}


	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}


	public int getSalaire() {
		return salaire;
	}
	
	
	

}
