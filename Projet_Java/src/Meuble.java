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
        System.out.println("Ce meuble est : " + name);
        System.out.println("Il est fait avec : ");
        for (Lot lot : lotList){
            System.out.println(lot.getVolume() + " " + lot.getPieceDetachee().getNom());
        }
        System.out.println("Il se trouve dans : " + piece);
        System.out.println("Il prend " + dureeDeConstr + " pour être construit");
    }
}
