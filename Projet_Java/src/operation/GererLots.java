package operation;

import material.Lot;

public interface GererLots {

	public Lot deplacer_lot(Lot l, int index);
	public Lot ajouter_lot(Lot l);
	public Lot retirer_lot(Lot l);

}
