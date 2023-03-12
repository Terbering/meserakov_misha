package ex03;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import ex02.ViewResult;
import ex02.Item2d;
public class MainTest {

    private ViewResult viewResult;
    private ArrayList<Item2d> items;
    private static final double DELTA = 1e-15;

    @Before
    public void setUp() {
        viewResult = new ViewResult(3);
        items = viewResult.getItems();
    }

    @Test
    public void testCalc() {
        Map<String, Integer> expected = Map.of("tetradsCount", 1);
        assertEquals(expected, viewResult.calc(11));
    }

    @Test
    public void testInit() {
        viewResult.init(1.0);
        assertEquals(0.0, items.get(0).getDecimalNumber(), DELTA);
        assertEquals(1, items.get(0).getTetradsCount());
        assertEquals(1.0, items.get(1).getDecimalNumber(), DELTA);
        assertEquals(1, items.get(1).getTetradsCount());
        assertEquals(2.0, items.get(2).getDecimalNumber(), DELTA);
        assertEquals(1, items.get(2).getTetradsCount());
    }

    @Test
    public void testViewInit() {
        viewResult.viewInit();
        assertEquals(3, items.size());
    }

}