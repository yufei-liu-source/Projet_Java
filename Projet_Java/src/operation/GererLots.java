package operation;

import material.Lot;

public interface GererLots {

	public void deplacer_lot(Lot l, int index);
	public void ajouter_lot(Lot l);
	public void retirer_lot(Lot l);

}
