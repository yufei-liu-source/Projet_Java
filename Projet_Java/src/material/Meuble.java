package material;
import java.util.ArrayList;
import java.util.List;

public class Meuble {
    String name;
    Lot[] lotList;
    String piece;
    int dureeDeConstr;
	public int listeMeubleAC[] = new int[10]; // liste de meuble a construire , NOT SURE TO ADD NOR NOT

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
        System.out.println("Ce meuble prend " + dureeDeConstr + " pour etre construit");
    }
}
