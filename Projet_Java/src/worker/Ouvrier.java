package worker;

import material.Lot;
import operation.GererLots;

public class Ouvrier extends Personne implements GererLots{

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

	@Override
	public Lot deplacer_lot(Lot l, int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lot ajouter_lot(Lot l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lot retirer_lot(Lot l) {
		// TODO Auto-generated method stub
		return null;
	}


}
