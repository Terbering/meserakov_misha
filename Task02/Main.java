package meserakov_misha.Task02;

 /**
 * The class Main
 */ 
public class Main {

/** 
 *
 * Main
 *
 * @param args  the args
 */
    public static void main(String[] args) { 

        int decimalNumber = 12345;
        int quartetCount = countQuartets(decimalNumber);
        System.out.println(quartetCount);
    }


/** 
 *
 * Count quartets
 *
 * @param decimalNumber  the decimal number
 * @return int
 */
    public static int countQuartets(int decimalNumber) { 

        int binaryNumber = Integer.parseInt(Integer.toBinaryString(decimalNumber));
        int quartetCount = 0;
        while (binaryNumber >= 10000) {
            quartetCount++;
            binaryNumber /= 10000;
        }
        return quartetCount;
    }
}

