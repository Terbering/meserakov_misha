package ex02;

import java.io.Serializable;
/** Хранит исходные данные и результат вычислений.
 * @author xone
 * @version 1.0
 */
public class Item2d extends ex01.Item2d implements Serializable {
    private int decimalNumber;
    private int tetradsCount;
    private static final long serialVersionUID = 1L;
    public Item2d() {
        decimalNumber = 0;
        tetradsCount = 0;
    }

    public Item2d(int decimalNumber, int tetradsCount) {
        this.decimalNumber = decimalNumber;
        this.tetradsCount = tetradsCount;
    }

    public int setDecimalNumber(int decimalNumber) {
        return this.decimalNumber = decimalNumber;
    }

    public int getDecimalNumber() {
        return decimalNumber;
    }

    public int setTetradsCount(int tetradsCount) {
        return this.tetradsCount = tetradsCount;
    }

    public int getTetradsCount() {
        return tetradsCount;
    }

    public Item2d setValues(int decimalNumber, int tetradsCount) {
        this.decimalNumber = decimalNumber;
        this.tetradsCount = tetradsCount;
        return this;
    }

    @Override
    public String toString() {
        return "Decimal number = " + decimalNumber + ", Tetrads count = " + tetradsCount;
    }
}
