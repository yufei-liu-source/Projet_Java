package worker;


import java.util.ArrayList;
import java.util.List;

public class Equipe {

	private int idEquipe;
	static int MAX = 4;
	private Chef c;
	List<Personne> listEquipe = new ArrayList();
	
	public Equipe(int idEquipe, Chef c, List<Personne> listEquipe) {
		this.idEquipe = idEquipe;
		this.c = c;
		this.listEquipe = listEquipe;
	}
	
	/**
	 * 
	 * @param p
	 * @return the same list if there are too many workers or if the new worker already in this team
	 *         else the new list with this new worker
	 */
	public Personne recruter(Personne p) {
		if (listEquipe.size()<MAX) {
			if (listEquipe.contains(p)){			
				return (Personne) listEquipe;		
			}		
			else {			
				listEquipe.add(p);			
				return (Personne) listEquipe;
			}
		}else return (Personne) listEquipe;		
	}
	
	/**
	 * 
	 * @param p
	 * @return the list without this worker, the same list if the worker not in the list
	 */
	public Personne licencier(Personne p) {
		if (listEquipe.contains(p)){
			listEquipe.remove(p);
			return (Personne) listEquipe;		
		}		
		else {					
			return (Personne) listEquipe;
		}	
	}
	
	
	
}
