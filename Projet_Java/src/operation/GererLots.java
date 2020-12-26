package operation;

import material.Rangee;

public interface GererLots {

	public void deplacer_lot(int numLot, Rangee r1, int vol, Rangee r2);
	public void ajouter_lot(int numLot, int vol, Rangee r);
	public void retirer_lot(int numLot, int vol, Rangee r);

}
