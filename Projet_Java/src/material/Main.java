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
        Meuble chaise = new Meuble("Chaise",new Lot[]{new Lot(new Vis(200,10),1),new Lot(new Planche(1000,500),2)},"Salon",2);
        Meuble bibliotheque = new Meuble("Bibliotheque",new Lot[]{new Lot(new Vis(200,10),2),new Lot(new Planche(1000,500),4)},"Salon",4);
        
    	
    	
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
                Rangee1[i].setTableauLot(listedepart);
                Entrepot.listeRangee.add(Rangee1[i]);
                 
          
             }
            
        	
        	
        // A TESTER AVEC JUNIT System.out.println("Nombre de rangee de l'entrepot : " +Entrepot.getNbRangee());
        // A TESTER AVEC JUNIT System.out.println("Liste des rangees dans l'entrepot : " + Entrepot.getListeRangee().toString());

        System.out.println("Volume Rangee: " + Rangee1[1].getLongueur());
        for(int i=0;i<Entrepot.getNbRangee();i++) {
            System.out.println("Rangee numero "+ i+ ":" + Arrays.toString(Rangee1[i].getTableauRangee()));
        }


        //TEST DE LOT
        Rangee1[0].tableauLot[0]=1;
        Rangee1[0].tableauLot[1]=2;
        Rangee1[0].tableauLot[2]=2;
        Rangee1[1].tableauLot[3]=1;
        Rangee1[1].tableauLot[1]=1; 

        // RANGEE1 = 1 2 2 0
        // rangee2= 0 1 2 2 
        System.out.println("Rangee numero 1 apres modification:"+ Arrays.toString(Rangee1[0].getTableauRangee()));
        System.out.println("Rangee numero 2 apres modification:"+ Arrays.toString(Rangee1[1].getTableauRangee()));

        /*Debut de la journee*/
        
        int countJour = 0;
        System.out.println("Quel est votre role ? CHEF BRICO [0] ; CHEF STOCK [1] ; OUVRIER [2]");
        String choixRole= myObj.nextLine();  // Read user input
        int choixRoleInt= Integer.parseInt(choixRole);
        
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
	        	System.out.println("Comment voulez-vous manager les lots?"+"\n"+"Deplacer [0] ; Ajouter [1] ; Suprimer [2]"+"\n"+"Tapper le chiffre correspondant: ");
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
	       			
	       			Rangee1[rAjoute].ajouter_lot(idAjoute, vAjoute);
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
        			
        			Rangee1[rSupp].retirer_lot(idSupp, vSupp);
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
	        			
	       			Rangee1[rdep1].deplacer_lot(idDeplace, vDep, Rangee1[rdep2]);
	       			break;
	       		}
                System.out.println("Rangee numero 1 apres modification:"+ Arrays.toString(Rangee1[0].getTableauRangee()));
                System.out.println("Rangee numero 2 apres modification:"+ Arrays.toString(Rangee1[1].getTableauRangee()));
        	}
        	else if(choixJourInt==2) {
        		String [] listeMeubleTEST = {"Table [1]","Bibliotheque [2] ", "Chaise [3]"};
        		System.out.println("FAIRE UN MEUBLE");
        		System.out.println("Quel meuble voulez vous monter ? "+ Arrays.toString(listeMeubleTEST));
        		String choixMeuble = myObj.nextLine();
            	int choixMeubleInt= Integer.parseInt(choixMeuble);
        		
            	//Creer une table
            	
        		if(choixMeubleInt==1) {
        			table.construireMeuble(table, Rangee1);
        			countJour+=table.dureeDeConstr;
        			System.out.println("Jour: " + countJour);
        		}
        		//Creer une bibliotheque
        		else if(choixMeubleInt==2) {
        			bibliotheque.construireMeuble(bibliotheque, Rangee1);
        			countJour+=bibliotheque.dureeDeConstr;
        			System.out.println("Jour: " + countJour);
        		}
        		// Creer une chaise
        		else if(choixMeubleInt==3) {
        			chaise.construireMeuble(chaise, Rangee1);
        			countJour+=chaise.dureeDeConstr;
        			System.out.println("Jour: " + countJour);
        		}
        			
        		//added test HEAD
        	

        	//branch 'master' of https://github.com/yufei-liu-source/Projet_Java.git
    }
        	
    }

    
        

    
}


