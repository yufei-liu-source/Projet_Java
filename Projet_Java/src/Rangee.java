
import java.util.ArrayList;
import java.util.List;

public class Rangee {
	private static int count=0;
	private static int ID;
	private int longueur;
	private int largeur=1;
	private int hauteur=1;
	private int volume= longueur*largeur*hauteur;
	private int tableauRangee[] = new int[longueur];
	static ArrayList<Lot> listeLot= new ArrayList<Lot>();
	
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
    public void addLot(Lot lotA) {
    	for(int i=0; i<lotA.getVolume(); i++) {
    		if(listeLot==null) {
    			listeLot.add(lotA);
    			}
    		else {

    		}
			break;

    	}
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
		return tableauRangee;
	}

	public void setTableauRangee(int[] tableauRangee) {
		this.tableauRangee = tableauRangee;
	}


	

}
