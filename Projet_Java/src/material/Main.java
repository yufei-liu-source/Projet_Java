package material;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;



public class Main {

    public static void main(String args[]){
    	

        Meuble table = new Meuble("Table",new Lot[]{new Lot(new Vis(200,10),1),new Lot(new Planche(1000,500),3)},"Salon",3);
        Meuble chaise = new Meuble("Chaise",new Lot[]{new Lot(new Vis(200,10),1),new Lot(new Planche(1000,500),2)},"Salon",2);
        Meuble bibliotheque = new Meuble("Bibliotheque",new Lot[]{new Lot(new Vis(200,10),2),new Lot(new Planche(1000,500),4)},"Salon",4);
        
    	
    	
    	/* Creation de l'Entrepot par l'utilisateur*/
    	
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Combien de rang�es dans l'entrepot ? (Minimum 2) ");
        String saisieNbRangee = myObj.nextLine();  // Read user input
        System.out.println("Nombre de rang�es cree pour l'entrepot : " + saisieNbRangee);  // Output user input
        int saisieNbRangeeInt=Integer.parseInt(saisieNbRangee);
        Entrepot Entrepot1= new Entrepot(saisieNbRangeeInt);
        
        /*Creation des rangees demandees */
        System.out.println("Combien de lots peut contenir une rang�e ? (Minimum 2)");
        String saisieLongueurRangee = myObj.nextLine();  // Read user input
        System.out.println("Une rang�e peut contenir : " + saisieLongueurRangee + " lots");
        int saisieLongueurRangeeInt= Integer.parseInt(saisieLongueurRangee);

        Rangee [] Rangee1 = new Rangee[saisieNbRangeeInt];
        Arrays.fill(Rangee1,new Rangee(saisieNbRangeeInt));
        
        for(int i=0;i<saisieNbRangeeInt;i++) {
        		int[] listedepart= new int[saisieLongueurRangeeInt];
        		Arrays.fill(listedepart, 0);
                Rangee1[i] = new Rangee(saisieLongueurRangeeInt);
                Rangee1[i].setTableauLot(listedepart);
                Entrepot.listeRangee.add(Rangee1[i]);
                 
          
             }
            
        	
        	
        // A TESTER AVEC JUNIT System.out.println("Nombre de rangee de l'entrepot : " +Entrepot.getNbRangee());
        // A TESTER AVEC JUNIT System.out.println("Liste des rangees dans l'entrepot : " + Entrepot.getListeRangee().toString());

        System.out.println("Volume Rangee: " + Rangee1[1].getLongueur());
        for(int i=0;i<Entrepot.getNbRangee();i++) {
            System.out.println("Rangee numero "+ i+ ":" + Arrays.toString(Rangee1[i].getTableauRangee()));
        }


        //Lot de base c�ee al�atoirement
        Rangee1[0].tableauLot[0]=ThreadLocalRandom.current().nextInt(0, 2 + 1);
        Rangee1[0].tableauLot[1]=ThreadLocalRandom.current().nextInt(0, 2 + 1);
        Rangee1[1].tableauLot[1]=ThreadLocalRandom.current().nextInt(0, 2 + 1);
        Rangee1[1].tableauLot[0]=ThreadLocalRandom.current().nextInt(0, 2 + 1);
        
        System.out.println("Vos lots de base sont : "+ "\n Rangee 1: " + Arrays.toString(Rangee1[0].getTableauRangee())
        		+"\n Rangee 2: " + Arrays.toString(Rangee1[1].getTableauRangee()));

        //Working Area
        System.out.println("Votre espace de construction est le suivant : ");
        Rangee [] WorkingArea = new Rangee[1];
        Arrays.fill(WorkingArea,new Rangee(1));
        int[] listedepartzero= new int[saisieLongueurRangeeInt];
		Arrays.fill(listedepartzero, 0);
		WorkingArea[0].setTableauLot(listedepartzero);
        System.out.println(Arrays.toString(WorkingArea[0].getTableauRangee()));

        //Debut de la journee
        
        int countJour = 0;

       /* System.out.println("Quel est votre role ? CHEF BRICO [0] ; CHEF STOCK [1] ; OUVRIER [2]");
        String choixRole= myObj.nextLine();  // Read user input
        int choixRoleInt= Integer.parseInt(choixRole);*/

        boolean libre = true;

    	while(true) {
            
    		if(!libre) {
            	System.out.println("En train de travailler, revenez vous dans " + countJour+ " jours");
                }  
            else { 
        		
            	System.out.println("Que voulez-vous faire aujourd'hui ?"+"\n"+"RIEN [0]  ; MANAGER LES LOTS [1] ; FAIRE UN MEUBLE [2]"+"\n"+"Tapper le chiffre correspondant: ");
	    		String choixJour = myObj.nextLine();  // Read user input
	    		int choixJourInt= Integer.parseInt(choixJour);
	    		//System.out.println("Jour: " + countJour+ ", Choix du Jour : ");
	    
	    		while(choixJourInt==0) {
	    			System.out.println("RIEN");
	    			System.out.println("Que voulez-vous faire aujourd'hui ?"+"\n"+"RIEN [0]  ; MANAGER LES LOTS [1] ; FAIRE UN MEUBLE [2]"+"\n"+"Tapper le chiffre correspondant: ");
	    			String choixJour2 = myObj.nextLine();
	    			int choixJourInt2= Integer.parseInt(choixJour2);
	    			choixJourInt=choixJourInt2;
	    		}
	    		
	    		if(choixJourInt==1) {
	    			System.out.println("MANAGER LES LOTS");
	
	    			System.out.println("Comment voulez-vous manager les lots?"+"\n"+"Deplacer [0]  ;Ajouter [1] ; Suprimer [2]"+"\n"+"Tapper le chiffre correspondant: ");
	    			String choixGererLots = myObj.nextLine();
	    			int choixGererLotsInt = Integer.parseInt(choixGererLots);
	    			switch(choixGererLotsInt) {
	    			case 1:
	    				System.out.println("Quel est l'ID de lots voulez vous ajouter?");
	    				String idLots_ajouter = myObj.nextLine();
	    				int idAjoute = Integer.parseInt(idLots_ajouter);
	    				/*Verification d'existence de lot
	    				 */
	    				System.out.println("Combien de lots voulez vous ajouter?"+"\n"+"Tappez le chiffre de volume:");
	    				String volume_ajouter = myObj.nextLine();
	    				int vAjoute = Integer.parseInt(volume_ajouter);
	    			
	    				System.out.println("Vous voulez l'ajouter a quelle rangee?"+"\n"+"Tappez l'identifiant de rangee:");
	    				String rangee_ajouter = myObj.nextLine();
	    				int rAjoute = Integer.parseInt(rangee_ajouter);
	    			
	    				if(rAjoute < Rangee1.length) {
	    					Rangee1[rAjoute].ajouter_lot(idAjoute, vAjoute);

	    					}
	    				else System.out.println("Rangee not found!");
	    				break;
	    			
	    			case 2:
	    				System.out.println("Vous voulez supprimer le lot de quelle rangee?"+"\n"+"Tappez l'identifiant de rangee:");
	    				String rangee_supp = myObj.nextLine();
	    				int rSupp = Integer.parseInt(rangee_supp);
	    			
	    				System.out.println("Quel est l'ID de lots voulez vous supprimer?");
	    				String idLots_supp = myObj.nextLine();
	    				int idSupp = Integer.parseInt(idLots_supp);
	    			
	    				System.out.println("Combien de lots voulez vous supprimer?"+"\n"+"Tappez le chiffre de volume:");
	    				String volume_supp= myObj.nextLine();
	    				int vSupp = Integer.parseInt(volume_supp);
	    			
	    				if(rSupp < Rangee1.length) {
	    					Rangee1[rSupp].retirer_lot(idSupp, vSupp);
	    					}
	    				else System.out.println("Rangee not found!");
	    				break;
	    			
	    			case 0: 
	    				System.out.println("Quel est l'ID de lots voulez vous deplacer?");
	    				String idLots_deplacer = myObj.nextLine();
	    				int idDeplace = Integer.parseInt(idLots_deplacer);
	    			
	    				System.out.println("Quelle est la rangee originale?"+"\n"+"Tappez l'identifiant de rangee:");
	    				String rangee_dep1 = myObj.nextLine();
	    				int rdep1 = Integer.parseInt(rangee_dep1);
	    				
	    				System.out.println("Combien de lots voulez vous deplacer?"+"\n"+"Tappez le chiffre de volume:");
	    				String volume_dep= myObj.nextLine();
	    				int vDep = Integer.parseInt(volume_dep);
	    				
	    				System.out.println("Quelle est la rangee arrivee?"+"\n"+"Tappez l'identifiant de rangee:");
	    				String rangee_dep2 = myObj.nextLine();
	    				int rdep2 = Integer.parseInt(rangee_dep2);
	
	    				if(rdep1 < Rangee1.length) {
	    					if (rdep2 < Rangee1.length) {
	    						Rangee1[rdep1].deplacer_lot(idDeplace, vDep, Rangee1[rdep2]);
	    					}else System.out.println("Arrival rangee not found!");	
	    				}
	    				else System.out.println("Departure rangee not found!");
	    				break;
	    			}
	    			
	    		//Affichage des rangees apres le management de Lots
	    	       for(int i=0;i<Entrepot.getNbRangee();i++) {
	    	           System.out.println("Rangee numero "+ i+ ":" + Arrays.toString(Rangee1[i].getTableauRangee()));
	    	        }
	    			
	    		}
    		
	    		else if(choixJourInt==2) {
	    			String [] listeMeubleTEST = {"Table [1]","Bibliotheque [2] ", "Chaise [3]"};
	    			System.out.println("FAIRE UN MEUBLE");
	    			System.out.println("Quel meuble voulez vous monter ? "+ Arrays.toString(listeMeubleTEST));
	    			String choixMeuble = myObj.nextLine();
	    			int choixMeubleInt= Integer.parseInt(choixMeuble);
	    			
	    			
//-------------------------------------------------------------------   	
	    			
	            	//Creer une table
	            	
	        		if(choixMeubleInt==1) {
	        			System.out.println("Pour creer une table il vous faut 3 planches et 1 vis");
	        			System.out.println("Pour faire un meuble, il faut d'abord deplacer les lots dont vous avez besoin dans l'espace de construction");
	        			System.out.println("Voici vos rangees pour l'instant : ");
	        			
	 	    	       for(int i=0;i<Entrepot.getNbRangee();i++) {
		    	           System.out.println("Rangee numero "+ i+ ":" + Arrays.toString(Rangee1[i].getTableauRangee()));
		    	        }
	 	    	      System.out.println("---Appuyez sur 0 pour continuer---");
	 	    	      
	 	    	        String choixContinue= myObj.nextLine();  // Read user input

	 	    	        int choixContinueInt= Integer.parseInt(choixContinue);
	 	    	        if (choixContinueInt==0) {
		 	    	        boolean deplacement= true;
		 	    	        while(deplacement==true) {	
			    			int choixGererLotsInt = 0;
			    			switch(choixGererLotsInt) {
			    			case 0: 
			    				System.out.println("Quel est l'ID de lots voulez vous deplacer?");
			    				String idLots_deplacer = myObj.nextLine();
			    				int idDeplace = Integer.parseInt(idLots_deplacer);
			    			
			    				System.out.println("Quelle est la rangee originale?"+"\n"+"Tappez l'identifiant de rangee:");
			    				String rangee_dep1 = myObj.nextLine();
			    				int rdep1 = Integer.parseInt(rangee_dep1);
			    				
			    				System.out.println("Combien de lots voulez vous deplacer?"+"\n"+"Tappez le chiffre de volume:");
			    				String volume_dep= myObj.nextLine();
			    				int vDep = Integer.parseInt(volume_dep);

			    				if(rdep1 < Rangee1.length) {
			    						Rangee1[rdep1].deplacer_lot(idDeplace, vDep, WorkingArea[0]);
			    					}
			    				else System.out.println("Departure rangee not found!");
			    				break;
			    			}
			    			System.out.println(Arrays.toString(WorkingArea[0].getTableauRangee()));
	 	    	        }
		    			System.out.println("Voulez vous deplacer un autre lot ? Non[0] Oui[1]");
		    	        String choixDeplacement= myObj.nextLine();  // Read 
		    	        int choixDeplacementInt= Integer.parseInt(choixDeplacement);
		    	        if(choixDeplacementInt==0) {
		    	        	deplacement=false;
		    	        }
		    	        else {
		    	        	deplacement=true;
		    	        }
		    	        
		    	        table.construireMeuble(table, WorkingArea);
		    			
	        			countJour+=table.dureeDeConstr;
	        			System.out.println("Jour: " + countJour);	
	        		}
	 	    	        
	 	    	        
//-------------------------------------------------------------------   	        		
	        		//Creer une bibliotheque
	        		else if(choixMeubleInt==2) {
	        			System.out.println("Pour creer une bibliotheque il vous faut 4 planches et 2 vis");
	        		}
        			System.out.println("Pour faire un meuble, il faut d'abord deplacer les lots dont vous avez besoin dans l'espace de construction");
        			System.out.println("Voici vos rangees pour l'instant : ");
        			
 	    	       for(int i=0;i<Entrepot.getNbRangee();i++) {
	    	           System.out.println("Rangee numero "+ i+ ":" + Arrays.toString(Rangee1[i].getTableauRangee()));
	    	        }
 	    	      System.out.println("---Appuyez sur 0 pour continuer---");
 	    	      
 	    	        String choixContinue2= myObj.nextLine();  // Read user input

 	    	        int choixContinueInt2= Integer.parseInt(choixContinue2);
 	    	        if (choixContinueInt2==0) {
	 	    	        boolean deplacement= true;
	 	    	        while(deplacement==true) {	
		    			int choixGererLotsInt = 0;
		    			switch(choixGererLotsInt) {
		    			case 0: 
		    				System.out.println("Quel est l'ID de lots voulez vous deplacer?");
		    				String idLots_deplacer = myObj.nextLine();
		    				int idDeplace = Integer.parseInt(idLots_deplacer);
		    			
		    				System.out.println("Quelle est la rangee originale?"+"\n"+"Tappez l'identifiant de rangee:");
		    				String rangee_dep1 = myObj.nextLine();
		    				int rdep1 = Integer.parseInt(rangee_dep1);
		    				
		    				System.out.println("Combien de lots voulez vous deplacer?"+"\n"+"Tappez le chiffre de volume:");
		    				String volume_dep= myObj.nextLine();
		    				int vDep = Integer.parseInt(volume_dep);

		    				if(rdep1 < Rangee1.length) {
		    						Rangee1[rdep1].deplacer_lot(idDeplace, vDep, WorkingArea[0]);
		    					}
		    				else System.out.println("Departure rangee not found!");
		    				break;
		    			}
		    			System.out.println(Arrays.toString(WorkingArea[0].getTableauRangee()));
 	    	        }
	    			System.out.println("Voulez vous deplacer un autre lot ? Non[0] Oui[1]");
	    	        String choixDeplacement= myObj.nextLine();  // Read 
	    	        int choixDeplacementInt= Integer.parseInt(choixDeplacement);
	    	        if(choixDeplacementInt==0) {
	    	        	deplacement=false;
	    	        }
	    	        else {
	    	        	deplacement=true;
	    	        }
	    	        
	    	        table.construireMeuble(bibliotheque, WorkingArea);
	    			
        			countJour+=bibliotheque.dureeDeConstr;
        			System.out.println("Jour: " + countJour);	
        		}
	        		
//-------------------------------------------------------------------    	        
	        		// Creer une chaise
	        		else if(choixMeubleInt==3) {
	        			System.out.println("Pour creer une chaise il vous faut 2 planches et 1 vis");
        			System.out.println("Pour faire un meuble, il faut d'abord deplacer les lots dont vous avez besoin dans l'espace de construction");
        			System.out.println("Voici vos rangees pour l'instant : ");
        			
 	    	       for(int i=0;i<Entrepot.getNbRangee();i++) {
	    	           System.out.println("Rangee numero "+ i+ ":" + Arrays.toString(Rangee1[i].getTableauRangee()));
	    	        }
 	    	      System.out.println("---Appuyez sur 0 pour continuer---");
 	    	      
 	    	        String choixContinue3= myObj.nextLine();  // Read user input

 	    	        int choixContinueInt3= Integer.parseInt(choixContinue3);
 	    	        if (choixContinueInt3==0) {
	 	    	        boolean deplacement= true;
	 	    	        while(deplacement==true) {	
		    			int choixGererLotsInt = 0;
		    			switch(choixGererLotsInt) {
		    			case 0: 
		    				System.out.println("Quel est l'ID de lots voulez vous deplacer?");
		    				String idLots_deplacer = myObj.nextLine();
		    				int idDeplace = Integer.parseInt(idLots_deplacer);
		    			
		    				System.out.println("Quelle est la rangee originale?"+"\n"+"Tappez l'identifiant de rangee:");
		    				String rangee_dep1 = myObj.nextLine();
		    				int rdep1 = Integer.parseInt(rangee_dep1);
		    				
		    				System.out.println("Combien de lots voulez vous deplacer?"+"\n"+"Tappez le chiffre de volume:");
		    				String volume_dep= myObj.nextLine();
		    				int vDep = Integer.parseInt(volume_dep);

		    				if(rdep1 < Rangee1.length) {
		    						Rangee1[rdep1].deplacer_lot(idDeplace, vDep, WorkingArea[0]);
		    					}
		    				else System.out.println("Departure rangee not found!");
		    				break;
		    			}
		    			System.out.println(Arrays.toString(WorkingArea[0].getTableauRangee()));
 	    	        }
	    			System.out.println("Voulez vous deplacer un autre lot ? Non[0] Oui[1]");
	    	        String choixDeplacement= myObj.nextLine();  // Read 
	    	        int choixDeplacementInt= Integer.parseInt(choixDeplacement);
	    	        if(choixDeplacementInt==0) {
	    	        	deplacement=false;
	    	        }
	    	        else {
	    	        	deplacement=true;
	    	        }
	    	        
	    	        chaise.construireMeuble(chaise, WorkingArea);
	    			
        			countJour+=chaise.dureeDeConstr;
        			System.out.println("Jour: " + countJour);	
        		}
	        		}
	        		}
	
	    		
	    		}
    	
            }
        
    	}
    }
}

