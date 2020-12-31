package material;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RetirerMeubleTest {


	@Test
	void test() {
	    Rangee [] Rangee1 = new Rangee[4];

	    Rangee1[0].tableauLot[0]=1;
	    Rangee1[0].tableauLot[1]=2;
	    Rangee1[0].tableauLot[2]=2;
	    Rangee1[0].tableauLot[3]=0;
	    
	    Rangee1[1].tableauLot[0]=1;
	    Rangee1[1].tableauLot[1]=1; 
	    Rangee1[1].tableauLot[2]=2;
	    Rangee1[1].tableauLot[3]=2;
	    
	    Rangee1[2].tableauLot[0]=1;
	    Rangee1[2].tableauLot[1]=2;
	    Rangee1[2].tableauLot[2]=2;
	    Rangee1[2].tableauLot[3]=0;
	    
	    Rangee1[3].tableauLot[0]=1;
	    Rangee1[3].tableauLot[1]=1; 
	    Rangee1[3].tableauLot[2]=2;
	    Rangee1[3].tableauLot[3]=0;
	    // RANGEE1 = 1 2 2 0
	    // rangee2= 1 1 2 2 
	    //rangee 3= 1 2 2 0
	    //rangee 4= 1 1 2 0
	   Rangee1[0].retirer_lot(1, 1);
	   Rangee [] Rangee2= new Rangee[4];
	   Rangee2[0].tableauLot[0]=0;
	   Rangee2[0].tableauLot[1]=2;
	   Rangee2[0].tableauLot[2]=2;
	   Rangee2[0].tableauLot[3]=0;
	   System.out.println(Rangee1[0].toString());
	   

       Assert.assertEquals( Rangee2[0], Rangee1[0] );
       
            
	}

}
