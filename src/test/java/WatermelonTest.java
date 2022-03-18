import org.junit.Test;
import static org.junit.Assert.*;
public class WatermelonTest {
    @Test
    public void test1(){
        Watermelon w = new Watermelon();
        assertEquals("No", w.divideWatermelon(-10));
        assertEquals("No", w.divideWatermelon(0));
        assertEquals("No", w.divideWatermelon(1));
        assertEquals("No", w.divideWatermelon(2));
        assertEquals("No", w.divideWatermelon(3));
        assertEquals("No", w.divideWatermelon(5));
        assertEquals("No", w.divideWatermelon(51));
        assertEquals("No", w.divideWatermelon(99));
        assertEquals("No", w.divideWatermelon(150));
        assertEquals("Yes", w.divideWatermelon(4));
        assertEquals("Yes", w.divideWatermelon(6));
        assertEquals("Yes", w.divideWatermelon(16));
        assertEquals("Yes", w.divideWatermelon(30));
        assertEquals("Yes", w.divideWatermelon(50));
        assertEquals("Yes", w.divideWatermelon(80));

    }
}
