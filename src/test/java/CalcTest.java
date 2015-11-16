import bsu.Calculator;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalcTest{

    Calculator calculate = new Calculator();

    @Test
    public void testSum() throws Exception {
        double n = calculate.sum(2, 2);
        assertEquals(4.0, n);
    }

    @Test
    public void testSubtract() throws Exception {
        double n = calculate.subtract(2, 2);
        assertEquals(0.0, n);
    }

    @Test
    public void testMultiply() throws Exception {
        double n = calculate.multiply(2, 2);
        assertEquals(4.0, n);
    }

    @Test
    public void testDivide() throws Exception {
        double n = calculate.divide(2, 2);
        assertEquals(1.0, n);
    }

    @Test
    public void testResult() throws Exception {

    }
}