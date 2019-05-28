import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before

    public void setup() {
        calculator = new Calculator(15, 5);
    }

    @Test
    public void add() {
        assertEquals(20, calculator.add(15, 5));
    }

    @Test
    public void subtract() {
        assertEquals(10, calculator.subtract(15, 5));
    }

    @Test
    public void multiply() {
        assertEquals(75, calculator.multiply(15, 5));
    }

    @Test
    public void divide() {
        assertEquals(3, calculator.divide(15, 5));
    }
}