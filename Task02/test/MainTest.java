package ex01;

import ex01.Calc;
import ex01.Item2d;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testInit() {
        Calc calc = new Calc();
        calc.init(10);
        Item2d result = calc.getResult();
        assertEquals(10, result.getDecimalNumber());
        assertEquals(1, result.getTetradsCount());
    }

    @Test
    public void testSaveAndRestore() throws Exception {
        Calc calc = new Calc();
        calc.init(15);
        calc.save();

        Calc calc2 = new Calc();
        calc2.restore();

        assertEquals(calc.getResult().getDecimalNumber(), calc2.getResult().getDecimalNumber());
        assertEquals(calc.getResult().getTetradsCount(), calc2.getResult().getTetradsCount());
    }
    @Test
    public void testSetValuesAndGetters() {
        Item2d item = new Item2d();
        item.setValues(15, 4);

        assertEquals(15, item.getDecimalNumber());
        assertEquals(4, item.getTetradsCount());
    }

    @Test
    public void testToString() {
        Item2d item = new Item2d(10, 3);

        String expectedString = "Decimal number = 10, Tetrads count = 3";
        assertEquals(expectedString, item.toString());
    }

}