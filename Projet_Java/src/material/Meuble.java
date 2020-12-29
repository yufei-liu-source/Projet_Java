package material;
import java.util.ArrayList;
import java.util.List;

public class Meuble {
    String name;
    Lot[] lotList;
    String piece;
    int dureeDeConstr;


    public Meuble(String name, Lot[] listLots, String piece, int dureeDeConstr) {
        this.name = name;
        lotList = listLots;
        this.piece = piece;
        this.dureeDeConstr = dureeDeConstr;
    }

    public void afficherMeuble(){
        for (Lot lot : lotList){
            System.out.println(lot.getVolume() + " " + lot.getPieceDetachee().getNom());
        }
        System.out.println("Ce meuble se trouve dans : " + piece);
        System.out.println("Ce meuble prend " + dureeDeConstr + " jours pour etre construit");
    }
    public void construireMeuble(Meuble meuble, Rangee rangee []) {
    	if(meuble.name=="Table") {
	    	System.out.println("Pour creer une Table: ");
			meuble.afficherMeuble();
			//Verification des pieces detaches
			int countVis=0;
			for(int i = 0; i<Entrepot.getNbRangee();i++) {
				for(int j=0; j<rangee[i].getLongueur();j++) {
					if (rangee[i].tableauLot[j]== 1) { 	//exemple si ID du lot vis =1 
						countVis++;
						rangee[i].tableauLot[j]=0;
					}
				}
			}
			int countPlanche=0;
			for(int l = 0; l<Entrepot.getNbRangee();l++) {
	    		for(int k=0; k<rangee[l].getLongueur();k++) {
	    			if (rangee[l].tableauLot[k]== 2) {//exemple si ID du lot planche =2
	    				countPlanche++;
	    				rangee[l].tableauLot[k]=0;
	    				
	    				
	    					}
	    		}
			}
	    	if (countPlanche>=3 && countVis>=1) {
	    		System.out.println("Vous avez construit une table !");
	    		meuble.dureeDeConstr=3;
	    	}
	    	else {
	    		meuble.dureeDeConstr=0;
	    		System.out.println("Il n'est pas possible de construire une table actuellement, il vous manque: ");
	    		if((1-countVis)<=0) {
	    			System.out.println("0 vis");
	    		}
	    		else{
	    				System.out.println((1-countVis)+" vis");
	    			}
	    		if((3-countPlanche)<=0) {
	    			System.out.println("0 planches");
	    		}
	    		else {
	    			System.out.println((3-countPlanche)+" planches");
	    		}
	    	}
	    		}
    	else if(meuble.name=="Bibliotheque") {
    		System.out.println("Pour creer une Bibliotheque: ");
			meuble.afficherMeuble();
			//Verification des pieces detaches
			int countVis=0;
			for(int i = 0; i<Entrepot.getNbRangee();i++) {
				for(int j=0; j<rangee[i].getLongueur();j++) {
					if (rangee[i].tableauLot[j]== 1) { 	//exemple si ID du lot vis =1 
						countVis++;
						rangee[i].tableauLot[j]=0;
					}
				}
			}
			int countPlanche=0;
			for(int l = 0; l<Entrepot.getNbRangee();l++) {
        		for(int k=0; k<rangee[l].getLongueur();k++) {
        			if (rangee[l].tableauLot[k]== 2) { 	//exemple si ID du lot planche =2
        				countPlanche++;
        				rangee[l].tableauLot[k]=0;

        					}
        		}
			}
        	if (countPlanche>=4 && countVis>=2) {
        		System.out.println("Vous avez construit une Bibliotheque !");
        		meuble.dureeDeConstr=4;
        		
        	}
        	else {
        		meuble.dureeDeConstr=0;
	    		System.out.println("Il n'est pas possible de construire une bibliotheque actuellement, il vous manque: ");
	    		if((2-countVis)<=0) {
	    			System.out.println("0 vis");
	    		}
	    		else{
	    				System.out.println((2-countVis)+" vis");
	    			}
	    		if((4-countPlanche)<=0) {
	    			System.out.println("0 planches");
	    		}
	    		else {
	    			System.out.println((4-countPlanche)+" planches");
	    		}
	    	}

        		}
    	else if(meuble.name=="Chaise") {
	    	System.out.println("Pour creer une Chaise: ");
			meuble.afficherMeuble();
			//Verification des pieces detaches
			int countVis=0;
			for(int i = 0; i<Entrepot.getNbRangee();i++) {
				for(int j=0; j<rangee[i].getLongueur();j++) {
					if (rangee[i].tableauLot[j]== 1) { 	//exemple si ID du lot vis =1 
						countVis++;
						rangee[i].tableauLot[j]=0;
					}
				}
			}
			int countPlanche=0;
			for(int l = 0; l<Entrepot.getNbRangee();l++) {
	    		for(int k=0; k<rangee[l].getLongueur();k++) {
	    			if (rangee[l].tableauLot[k]== 2) { 	//exemple si ID du lot planche =2
	    				countPlanche++;
	    				rangee[l].tableauLot[k]=0;
	    					}
	    		}
			}
	    	if (countPlanche>=2 && countVis>=1) {
	    		System.out.println("Vous avez construit une chaise !");
	    		meuble.dureeDeConstr=2;
	    	}
	    	else {
	    		meuble.dureeDeConstr=0;
	    		System.out.println("Il n'est pas possible de construire une chaise actuellement, il vous manque: ");
	    		if((1-countVis)<=0) {
	    			System.out.println("0 vis");
	    		}
	    		else{
	    				System.out.println((1-countVis)+" vis");
	    			}
	    		if((2-countPlanche)<=0) {
	    			System.out.println("0 planches");
	    		}
	    		else {
	    			System.out.println((2-countPlanche)+" planches");
	    		}
	    	}

	    		}
    }
    
    
    public int possibiliteConstruireTable(Meuble meuble, Rangee rangee []) {
			meuble.afficherMeuble();
			//Verification des pieces detaches
			int countVis=0;
			for(int i = 0; i<Entrepot.getNbRangee();i++) {
				for(int j=0; j<rangee[i].getLongueur();j++) {
					if (rangee[i].tableauLot[j]== 1) { 	//exemple si ID du lot vis =1 
						countVis++;
						rangee[i].tableauLot[j]=0;
					}
				}
			}
			int countPlanche=0;
			for(int l = 0; l<Entrepot.getNbRangee();l++) {
	    		for(int k=0; k<rangee[l].getLongueur();k++) {
	    			if (rangee[l].tableauLot[k]== 2) {//exemple si ID du lot planche =2
	    				countPlanche++;
	    				rangee[l].tableauLot[k]=0;
	    					}
	    		}
			}
	    	if (countPlanche>=3 && countVis>=1) {
	    		return 1;
	    	}
	    	else {
	    		return 0;
	    	}
	    		}
    }
    
    
