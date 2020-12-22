package operation;

import material.Lot;
import material.Rangee;

public interface GererLots {

	public void deplacer_lot(Lot l, Rangee r1, int vol, Rangee r2);
	public void ajouter_lot(Lot l, int vol, Rangee r);
	public void retirer_lot(Lot l, int vol, Rangee r);

}
