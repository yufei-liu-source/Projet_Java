package worker;


import java.util.ArrayList;
import java.util.List;

public class Equipe {

	private int idEquipe;
	static int MAX = 4;
	public Chef c;
	ArrayList<Ouvrier> listEquipe = new ArrayList();
	
	public Equipe(int idEquipe, Chef c, ArrayList<Ouvrier> listEquipe) {
		this.idEquipe = idEquipe;
		this.c = c;
		this.listEquipe = listEquipe;
	}
	
	
	public int getIdEquipe() {
		return idEquipe;
	}


	public void setIdEquipe(int idEquipe) {
		this.idEquipe = idEquipe;
	}


	public Chef getC() {
		return c;
	}


	public void setC(Chef c) {
		this.c = c;
	}


	public ArrayList<Ouvrier> getListEquipe() {
		return listEquipe;
	}


	public void setListEquipe(ArrayList<Ouvrier> listEquipe) {
		this.listEquipe = listEquipe;
	}


	/**
	 * 
	 * @param p
	 * @return the same list if there are too many workers or if the new worker already in this team
	 *         else the new list with this new worker
	 */
	public ArrayList<Ouvrier> recruter(Ouvrier p) {
		if (listEquipe.size()<MAX) {
			if (listEquipe.contains(p)){			
				return listEquipe;		
			}		
			else {			
				listEquipe.add(p);			
				return listEquipe;
			}
		}else return listEquipe;		
	}
	
	/**
	 * 
	 * @param p
	 * @return the list without this worker, the same list if the worker not in the list
	 */
	public ArrayList<Ouvrier> licencier(Ouvrier p) {
		if (listEquipe.contains(p)){
			listEquipe.remove(p);
			return listEquipe;		
		}		
		else {					
			return listEquipe;
		}	
	}
	
	public int CountSalaire() {
		int SalaireTotale = 0;
		if(this.c.active == true) {
			SalaireTotale = SalaireTotale + 10;
			for ( Ouvrier o : this.listEquipe ) {
				if (o.active == true) {
					SalaireTotale = SalaireTotale + 5;
				}
			}
			return SalaireTotale;
		}
		else return 0;
		
	}
}
