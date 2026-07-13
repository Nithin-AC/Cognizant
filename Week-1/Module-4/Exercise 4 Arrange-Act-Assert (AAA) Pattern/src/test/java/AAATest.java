package test.java;
import main.java.Calculator;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AAATest {

    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
        System.out.println("Setup Method Executed");
    }

    @After
    public void tearDown() {
        System.out.println("Teardown Method Executed");
    }

    @Test
    public void testAdd() {

        // Arrange
        int a = 4;
        int b = 6;

        // Act
        int result = calc.add(a, b);

        // Assert
        assertEquals(10, result);

        System.out.println("Test Executed Successfully");
    }
}