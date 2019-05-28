import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle myBottle;

    @Before

    public void setup(){
        myBottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, myBottle.getVolume());
    }

    @Test
    public void canDrinkWater(){
        myBottle.drink();
        assertEquals(90, myBottle.getVolume());
    }

    @Test
    public void canEmptyWaterBottle(){
        myBottle.emptyBottle();
        assertEquals(0, myBottle.getVolume());
    }

    @Test
    public void fillEmptyWaterBottle(){
        myBottle.fillBottle();
        assertEquals(100, myBottle.getVolume());
    }
}
