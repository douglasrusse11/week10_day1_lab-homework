import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTests {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 100);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void canPrint(){
        printer.print(10, 5);
        assertEquals(50, printer.getPaper());
    }

    @Test
    public void cannotPrint(){
        printer.print(100, 5);
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void hasVolume(){
        assertEquals(100, printer.getVolume());
    }

    @Test
    public void canReduceVolume(){
        printer.print(10, 5);
        assertEquals(50, printer.getVolume());
    }

    @Test
    public void cannotReduceVolume(){
        printer.print(100, 5);
        assertEquals(100, printer.getVolume());
    }
}
