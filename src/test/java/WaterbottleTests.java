import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterbottleTests {

    Waterbottle waterbottle;

    @Before
    public void before(){
        waterbottle = new Waterbottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void canDrink(){
        waterbottle.drink();
        waterbottle.drink();
        assertEquals(80, waterbottle.getVolume());
    }

    @Test
    public void canEmpty(){
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void canFill(){
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }

}

