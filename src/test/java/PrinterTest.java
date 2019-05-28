import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer myPrinter;

    @Before
    public void setup(){
        myPrinter = new Printer();
    }

    @Test
    public void hasPaper(){
        assertEquals(50, myPrinter.getPaperSheets());
    }

    @Test
    public void hasToner() {
        assertEquals(100, myPrinter.getTonerVolume());
    }

    @Test
    public void printJob(){
        assertEquals(true, myPrinter.printJob(2,2));
    }
}
