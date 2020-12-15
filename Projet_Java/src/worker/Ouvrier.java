package worker;

import material.Lot;
import material.Rangee;

public class Ouvrier extends Personne {

	private String specialite;
	private final int salaire = 5;
	

	public Ouvrier(int identifiant, String nom, String prenom, int id, String specialite) {
		super(identifiant, nom, prenom);
		this.specialite = specialite;
	}
	
	public Lot deplacer_lot(int lotID, int volume) {
		return null;		
	}
	
	public Lot ajouter_lot(int lotID, int volume) {
		return null;
		
	}
	
	public Lot retirer_lot(int lotID, int volume) {
		return null;
		
	}

}
