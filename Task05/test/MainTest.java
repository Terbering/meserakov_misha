package ex04;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import ex02.Item2d;
import ex02.ViewResult;

public class MainTest {

    @Test
    public void testGetItems() {
        ViewResult viewResult = new ViewResult(5);
        ArrayList<Item2d> items = viewResult.getItems();
        assertNotNull(items);
        assertEquals(5, items.size());
    }

    @Test
    public void testCalc() {
        ViewResult viewResult = new ViewResult();
        double decimalNumber = 27.0;
        int expectedTetradsCount = 2;
        assertEquals(expectedTetradsCount, viewResult.calc(decimalNumber).get("tetradsCount").intValue());
    }

    @Test
    public void testViewInit() {
        ViewResult viewResult = new ViewResult();
        viewResult.viewInit();
        ArrayList<Item2d> items = viewResult.getItems();
        assertNotNull(items);
        assertEquals(10, items.size());
    }

    @Test
    public void testViewSave() throws IOException {
        ViewResult viewResult = new ViewResult(5);
        viewResult.viewSave();
        File file = new File("items.bin");
        assertTrue(file.exists());
    }

    @Test
    public void testViewRestore() throws Exception {
        ViewResult viewResult1 = new ViewResult(5);
        viewResult1.viewSave();
        viewResult1.getItems().clear();
        viewResult1.viewRestore();
        ArrayList<Item2d> items1 = viewResult1.getItems();
        assertNotNull(items1);
        assertEquals(5, items1.size());

        ViewResult viewResult2 = new ViewResult(10);
        viewResult2.viewRestore();
        ArrayList<Item2d> items2 = viewResult2.getItems();
        assertNotNull(items2);
        assertEquals(5, items2.size());
    }
}