import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(4, 6);

        System.out.println("Result = " + result);

        assertEquals(10, result);
    }
}