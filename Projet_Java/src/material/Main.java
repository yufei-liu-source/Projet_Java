package material;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Main {

    public static void main(String args[]){
    	

        Meuble table = new Meuble("Table",new Lot[]{new Lot(new Vis(200,10),1),new Lot(new Planche(1000,500),3)},"Salon",3);
        
    	
    	
    	/* Creation de l'Entrepot par l'utilisateur*/
    	
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Combien de Rangee dans l'entrepot ? ");
        String saisieNbRangee = myObj.nextLine();  // Read user input
        System.out.println("Nombre de rangee cree pour l'entrepot : " + saisieNbRangee);  // Output user input
        int saisieNbRangeeInt=Integer.parseInt(saisieNbRangee);
        Entrepot Entrepot1= new Entrepot(saisieNbRangeeInt);
        
        /*Creation des rangees demandees */
        System.out.println("Quelle est la longueur d'une rangee ? ");
        String saisieLongueurRangee = myObj.nextLine();  // Read user input
        System.out.println("Longueur d'une rangee : " + saisieLongueurRangee);
        int saisieLongueurRangeeInt= Integer.parseInt(saisieLongueurRangee);
        
        Rangee [] Rangee1 = new Rangee[saisieNbRangeeInt];
        Arrays.fill(Rangee1,new Rangee(saisieNbRangeeInt));
        
        for(int i=0;i<saisieNbRangeeInt;i++) {
        		int[] listedepart= new int[saisieLongueurRangeeInt];
        		Arrays.fill(listedepart, 0);
                Rangee1[i] = new Rangee(saisieLongueurRangeeInt);
                Rangee1[i].setTableauRangee(listedepart);
                Entrepot.listeRangee.add(Rangee1[i]);
                 
          
             }
            
        	
        	
        System.out.println("Nombre de rangee de l'entrepot : " +Entrepot.getNbRangee());
        
        /*System.out.println("Liste des rangees dans l'entrepot : " + Entrepot.getListeRangee().toString());*/

        System.out.println("Volume Rangee: " + Rangee1[1].getLongueur());
        for(int i=0;i<Entrepot.getNbRangee();i++) {
            System.out.println("Rangee numero "+ i+ ":" + Arrays.toString(Rangee1[i].getTableauRangee()));
        }

        /* EXEMPLE OF : Modifying lots in tableauRangee[0]*/
        
        Rangee1[0].tableauRangee[0]=1;
        Rangee1[0].tableauRangee[1]=2;
        Rangee1[0].tableauRangee[2]=2;
        Rangee1[1].tableauRangee[3]=2;
        Rangee1[1].tableauRangee[1]=1;
        // RANGEE1 = 1 2 2 0
        // rangee2= 0 1 0 2 
        System.out.println("Rangee numero 1 apres modification:"+ Arrays.toString(Rangee1[0].getTableauRangee()));
        System.out.println("Rangee numero 1 apres modification:"+ Arrays.toString(Rangee1[1].getTableauRangee()));

  
        Lot lot1 = new Lot(new Vis(200,10),1);
        
        
        /*Debut de la journee*/
        int countJour = 0;
        System.out.println("Que voulez-vous faire aujourd'hui ?"+"\n"+"RIEN [0]  ; MANAGER LES LOTS [1] ; FAIRE UN MEUBLE [2]"+"\n"+"Tapper le chiffre correspondant: ");
        String choixJour = myObj.nextLine();  // Read user input
        int choixJourInt= Integer.parseInt(choixJour);
        System.out.println("Jour: " + countJour+ ", Choix du Jour : ");
        
        while(choixJourInt==0) {
        	System.out.println("RIEN");
        	System.out.println("Que voulez-vous faire aujourd'hui ?"+"\n"+"RIEN [0]  ; MANAGER LES LOTS [1] ; FAIRE UN MEUBLE [2]"+"\n"+"Tapper le chiffre correspondant: ");
        	String choixJour2 = myObj.nextLine();
        	int choixJourInt2= Integer.parseInt(choixJour2);
            choixJourInt=choixJourInt2;
        }
        
        	if(choixJourInt==1) {
        		System.out.println("MANAGER LES LOTS");
        	}
        	else if(choixJourInt==2) {
        		String [] listeMeubleTEST = {"Table [1]","Bibliotheque [2] ", "Chaise [3]"};
        		System.out.println("FAIRE UN MEUBLE");
        		System.out.println("Quel meuble voulez vous monter ? "+ Arrays.toString(listeMeubleTEST));
        		String choixMeuble = myObj.nextLine();
            	int choixMeubleInt= Integer.parseInt(choixMeuble);
        		
            	//Verification pour la creation du meuble :
            	
        		if(choixMeubleInt==1) {
        			System.out.println("Pour creer une Table: ");
        			table.afficherMeuble();
        			//Verification des pieces detaches
        			int countVis=0;
        			for(int i = 0; i<Entrepot.getNbRangee();i++) {
        				for(int j=0; j<Rangee1[i].getLongueur();j++) {
        					if (Rangee1[i].tableauRangee[j]== 1) { 	//exemple si ID du lot vis =1 
        						countVis++;
        					}
        				}
        			}
        			int countPlanche=0;
        			for(int l = 0; l<Entrepot.getNbRangee();l++) {
                		for(int k=0; k<Rangee1[l].getLongueur();k++) {
                			if (Rangee1[l].tableauRangee[k]== 2) { 	//exemple si ID du lot planche =2
                				countPlanche++;
                					}
                		}
        			}
                	if (countPlanche>=3 && countVis>=1) {
                		System.out.println("Vous pouvez construire une table !");
                	}
                	else {
                		System.out.println("Non pas possible");
                	}
                		}
        			
        		//added test
        	//
    }
        	
    }

    
        

    
}

