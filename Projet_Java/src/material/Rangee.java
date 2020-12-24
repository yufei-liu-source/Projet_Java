package material;
import operation.GererLots;

public class Rangee implements GererLots{
	private static int count=0;
	private static int ID;
	private int longueur;
	private int largeur=1;
	private int hauteur=1;
	private int volume= longueur*largeur*hauteur;
	public int tableauLot[] = new int[longueur];
	
	public Rangee(int longueur) {
		this.longueur=longueur;
		if(ID<Entrepot.getNbRangee()) {
		ID=count++;
		}
		else {
			System.out.println("Le nombre maximum de rangee est de "+ Entrepot.getNbRangee());
		}
	}

	public static int getID() {
		return ID;
	}

	public void setID(int iD) {
		if(ID>Entrepot.getNbRangee()) {
			System.out.println("Le nombre maximum de rangee est de "+ Entrepot.getNbRangee());
		}
		ID = iD;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public int[] getTableauRangee() {

		return tableauLot;
	}

	
	public void setTableauLot(int[] tableauRangee) {

		this.tableauLot = tableauRangee;
	}

	@Override
	public void deplacer_lot(Lot l, Rangee r1, int vol, Rangee r2) {
		// TODO Auto-generated method stub
		
		//move out
		/*for (int i=0;i<r1.tableauRangee.length;i++) {
			if(r1.tableauRangee[i] == numLot) {
				vol_r1++;
			}
		}
		
		if (vol_r1 == 0) {
			System.out.println("Lot not found in the rangee indicated!");
		}else if (vol_r1>=vol) {
			System.out.println("The stock of lot is available");
			int j = 0;
			int tmp = vol;
			while (tmp !=0 && j != r1.tableauRangee.length) {
				if (r1.tableauRangee[j] == numLot) {
					r1.tableauRangee[j] = 0;
					tmp--;
					j++;
				}
			}
		}else {
			System.out.println("Not enough stock!");
		}
		*/
		retirer_lot(l,vol,r1);
		
		//move in
		/*
		for (int i =0; i<r2.tableauRangee.length;i++) {
			if(r2.tableauRangee[i] == 0) {
				vol_r2++;
			}
		}
		
		if (vol_r2 < vol) {
			System.out.println("Not enough space for new lot!");
		}else {
			System.out.println("Enough space for new lot, move effected!");
			int i = 0;
			int tmp2 = vol;
			while (tmp2 != 0 && i != r2.tableauRangee.length) {
				if (r2.tableauRangee[i] == 0) {
					r2.tableauRangee[i] = numLot;
					tmp2--;
					i++;		
				}
			}
		}
		*/
		ajouter_lot(l,vol,r2);
	}

	@Override
	public void ajouter_lot(Lot l, int vol, Rangee r) {
		// TODO Auto-generated method stub
		int numLot = l.getID();
		int vol_r = 0;
		for (int i =0; i<r.tableauLot.length;i++) {
			if(r.tableauLot[i] == 0) {
				vol_r++;
			}
		}
		
		if (vol_r<vol) {
			System.out.println("Not enough space for new lot!");
		}else {
			System.out.println("Enough space for new lot, add effected!");
			int i = 0;
			int tmp3 = vol;
			while (tmp3 != 0 && i != r.tableauLot.length) {
				if (r.tableauLot[i] == 0) {
					r.tableauLot[i] = numLot;
					tmp3--;
					i++;
				}
			}
		}
	}

	@Override
	public void retirer_lot(Lot l, int vol, Rangee r) {
		// TODO Auto-generated method stub
		int numLot = l.getID();
		int vol_r = 0 ;    //volume of Lot in Rangee r
		
		for (int i=0;i<r.tableauLot.length;i++) {
			if(r.tableauLot[i] == numLot) {
				vol_r++;
			}
		}
		
		if (vol_r == 0) {
			System.out.println("Lot not found in the rangee indicated!");
		}else if (vol_r >=vol) {
			System.out.println("The stock of lot is available");
			int j = 0;
			int tmp2 = vol;
			while (tmp2 !=0 && j != r.tableauLot.length) {
				if (r.tableauLot[j] == numLot) {
					r.tableauLot[j] = 0;
					tmp2--;
					j++;
				}
			}
		}else {
			System.out.println("Not enough stock!");
		}
	}


	

}
