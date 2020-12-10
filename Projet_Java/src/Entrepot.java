package biilomo;

import java.util.ArrayList;
import java.util.List;

public class Entrepot {
	private static int nbRangee;
	static ArrayList<Rangee> listeRangee= new ArrayList<Rangee>(nbRangee);
	
	public Entrepot(int nbRangee) {
		this.nbRangee=nbRangee;
	}
	public boolean addRangee( Rangee newRangee ) {
		      listeRangee.add(newRangee);
		      return true;
	  }
	
	
	public static int getNbRangee() {
		return nbRangee;
	}
	public void setNbRangee(int nbRangee) {
		this.nbRangee = nbRangee;
	}
	public static ArrayList<Rangee> getListeRangee() {

		return listeRangee;
	}
	public void setListeRangee(ArrayList<Rangee> listeRangee) {
		this.listeRangee = listeRangee;
	}

}
