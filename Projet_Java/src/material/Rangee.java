package material;

public class Rangee {
	public static int count=0;
	public static int ID;
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

	
public void deplacer_lot(int numLot, int vol, Rangee r2) {
		
		//pour verifier si la rangee arrivee est ajoutable
		int vol_a = 0 ;    
		for (int i =0; i< r2.tableauLot.length;i++) {
			if(r2.tableauLot[i] == 0) {
				vol_a++;
			}
		}
		//pour verifier si la rangee depart est retirable
		int vol_r = 0 ;    
		for (int i=0;i<this.tableauLot.length;i++) {
			if(this.tableauLot[i] == numLot) {
				vol_r++;
			}
		}
		
		//Lorsque les deux condition sont satisfaits on lance le deplacement, sinon on a les erreurs
		if (vol_a>=vol && vol_r>=vol) {
			this.retirer_lot(numLot,vol);
			r2.ajouter_lot(numLot, vol);
		}else if(vol_a<vol && vol_r>=vol) {
			System.out.println("Not enough space for new lot!");
		}else {
			System.out.println("Not enough stock!");
		}
	}

	public void ajouter_lot(int numLot, int vol) {
		int vol_r = 0;
		for (int i =0; i< this.tableauLot.length;i++) {
			if(this.tableauLot[i] == 0) {
				vol_r++;
			}
		}
		
		if (vol_r < vol) {
			System.out.println("Not enough space for new lot!");
		}else {
			System.out.println("Enough space for new lot, add effected!");
			int i = 0;
			int tmp3 = vol;
			while (tmp3 != 0 && i != this.tableauLot.length) {
				if (this.tableauLot[i] == 0) {
					this.tableauLot[i] = numLot;
					tmp3--;
					i++;
				}else {
					i++;
				}
			}
		}
	}


	public void retirer_lot(int numLot, int vol) {
		int vol_r = 0 ; 

		for (int i=0;i<this.tableauLot.length;i++) {
			if(this.tableauLot[i] == numLot) {
				vol_r++;
			}
		}
		
		if (vol_r == 0) {
			System.out.println("Lot not found in the rangee indicated!");
		}else if (vol_r >=vol) {
			System.out.println("The stock of lot is available");
			int j = 0;
			int tmp2 = vol;
			while (tmp2 !=0 && j != this.tableauLot.length) {
				if (this.tableauLot[j] == numLot) {
					this.tableauLot[j] = 0;
					tmp2--;
					j++;
				}else {
					j++;
				}
			}
		}else {
			System.out.println("Not enough stock!");
		}
	}


	

}
