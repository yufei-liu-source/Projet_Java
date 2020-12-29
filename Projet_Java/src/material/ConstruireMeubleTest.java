package material;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ConstruireMeubleTest {

	@Test
	public void test() {
		Meuble test = new Meuble("Table",new Lot[]{new Lot(new Vis(200,10),1),new Lot(new Planche(1000,500),3)},"Salon",3);
        Rangee [] Rangee1 = new Rangee[4];
        Arrays.fill(Rangee1,new Rangee(4));
        
        for(int i=0;i<4;i++) {
        		int[] listedepart= new int[4];
        		Arrays.fill(listedepart, 0);
                Rangee1[i] = new Rangee(4);
                Rangee1[i].setTableauLot(listedepart);
                Entrepot.listeRangee.add(Rangee1[i]);
             }
        Rangee1[0].tableauLot[0]=1;
        Rangee1[0].tableauLot[1]=2;
        Rangee1[0].tableauLot[2]=2;
        Rangee1[1].tableauLot[0]=1;
        Rangee1[1].tableauLot[1]=1; 
        Rangee1[1].tableauLot[2]=2;
        Rangee1[1].tableauLot[3]=2;
        // RANGEE1 = 1 2 2 0
        // rangee2= 1 1 2 2 
        int output= test.possibiliteConstruireTable(test, Rangee1);
        System.out.println("test1");
        assertEquals(output,1);
        System.out.println("test2");
            
	}

}
