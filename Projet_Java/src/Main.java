import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String args[]){

        Meuble meuble = new Meuble("Table",new Lot[]{new Lot(new Vis(200,10),1),new Lot(new Planche(1000,500),3)},"Salon",3);
        meuble.afficherMeuble();

    }
}
