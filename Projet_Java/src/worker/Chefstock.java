package worker;

import material.Lot;
import operation.GererLots;

public class Chefstock extends Chef implements GererLots{

	public Chefstock(int identifiant, String nom, String prenom) {
		super(identifiant, nom, prenom);
		// TODO Auto-generated constructor stub
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
