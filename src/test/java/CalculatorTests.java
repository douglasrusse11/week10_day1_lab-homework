import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTests {

    Calculator calculator;

    @Before

    public void before(){
        calculator = new Calculator();
    }

    @Test

    public void hasAdd(){
        assertEquals(10, calculator.add(5,5));
    }

    @Test

    public void hasSubtract(){
        assertEquals(0, calculator.subtract(5,5));
    }

    @Test

    public void hasMultiply(){
        assertEquals(25, calculator.multiply(5,5));
    }

    @Test

    public void hasDivide(){
        assertEquals(1, calculator.divide(5,5), 0.0);
    }


}
