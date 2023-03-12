package ex02;

import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import static org.junit.Assert.*;
import ex02.ViewResult;


public class MainTest {
    private ViewResult view;

    @Before
    public void setUp() {
        view = new ViewResult();
    }

    @Test
    public void testGetItems() {
        ArrayList<Item2d> items = view.getItems();
        assertNotNull(items);
        assertEquals(ViewResult.DEFAULT_NUM, items.size());
    }

    @Test
    public void testCalc() {
        Map<String, Integer> result = view.calc(10.0);
        assertNotNull(result);
        assertTrue(result.containsKey("tetradsCount"));
        assertEquals(1, (int) result.get("tetradsCount"));
    }

    @Test
    public void testInit() {
        view.init(1.0);
        ArrayList<Item2d> items = view.getItems();
        assertNotNull(items);
        assertEquals(ViewResult.DEFAULT_NUM, items.size());
        int expectedDecimalNumber = 0;
        for (Item2d item : items) {
            assertEquals(expectedDecimalNumber, item.getDecimalNumber());
            expectedDecimalNumber++;
            assertTrue(item.getTetradsCount() > 0);
        }
    }

    @Test
    public void testViewSaveAndRestore() throws Exception {
        view.init(1.0);
        view.viewSave();
        ArrayList<Item2d> itemsBeforeRestore = view.getItems();
        view.viewRestore();
        ArrayList<Item2d> itemsAfterRestore = view.getItems();
        assertNotNull(itemsBeforeRestore);
        assertNotNull(itemsAfterRestore);
        assertEquals(itemsBeforeRestore.size(), itemsAfterRestore.size());
        for (int i = 0; i < itemsBeforeRestore.size(); i++) {
            Item2d itemBeforeRestore = itemsBeforeRestore.get(i);
            Item2d itemAfterRestore = itemsAfterRestore.get(i);
            assertEquals(itemBeforeRestore.getDecimalNumber(), itemAfterRestore.getDecimalNumber());
            assertEquals(itemBeforeRestore.getTetradsCount(), itemAfterRestore.getTetradsCount());
        }
    }

    @Test
    public void testViewShow() {
        view.init(1.0);
        view.viewShow();
        // manually verify output
    }
}