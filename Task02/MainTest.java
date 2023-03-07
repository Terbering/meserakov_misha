package meserakov_misha.Task02;

 /**
 * The class Main test
 */ 
public class MainTest {

/** 
 *
 * Assert equals
 *
 * @param i  the i
 * @param countQuartets  the count quartets
 */
    private void assertEquals(int i, int countQuartets) { 

        throw new UnsupportedOperationException("Not supported yet.");
    }

/** 
 *
 * Test count quartets
 *
 */
    public void testCountQuartets() { 

        assertEquals(3, Main.countQuartets(43690));
        assertEquals(4, Main.countQuartets(1000000));
        assertEquals(0, Main.countQuartets(5));
        assertEquals(1, Main.countQuartets(16));
    }

   
}
