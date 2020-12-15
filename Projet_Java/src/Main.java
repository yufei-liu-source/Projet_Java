
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){
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
        
        for(int i=0;i<saisieNbRangeeInt;i++) {
                 Rangee1[i] = new Rangee(saisieLongueurRangeeInt);
                 Entrepot.listeRangee.add(Rangee1[i]);
          
             }
            
        	
        	
        System.out.println("Nombre de rangee de l'entrepot : " +Entrepot.getNbRangee());
        System.out.println("Liste des rangees dans l'entrepot : " + Entrepot.getListeRangee());
        System.out.println("Volume Rangee: " + Rangee1[1].getLongueur());
        
        Lot lot1 = new Lot(new Vis(200,10),1);
        Rangee1[1].addLot(lot1);
        Rangee1[1].addLot(lot1);
        System.out.println("Tableau de la rangee 1: " + Rangee1[1].getTableauRangee());
        
        /*Meuble meuble = new Meuble("Table",new Lot[]{new Lot(new Vis(200,10),1),new Lot(new Planche(1000,500),3)},"Salon",3);
        meuble.afficherMeuble();*/
    }
}
