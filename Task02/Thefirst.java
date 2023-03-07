package meserakov_misha.Task02;

import java.io.Serializable;


 /**
 * The class Thefirst implements serializable
 */ 
public class Thefirst implements Serializable {
    private final double parameter1;
    private final double parameter2;
    private double result;


/** 
 *
 * Thefirst
 *
 * @param parameter1  the parameter1
 * @param parameter2  the parameter2
 * @return public
 */
    public Thefirst(double parameter1, double parameter2) { 

        this.parameter1 = parameter1;
        this.parameter2 = parameter2;
    }


/** 
 *
 * Calculate
 *
 */
    public void calculate() { 

        // Розрахунок результату
        this.result = this.parameter1 + this.parameter2;
    }


/** 
 *
 * Gets the result
 *
 * @return the result
 */
    public double getResult() { 

        return result;
    }
}

