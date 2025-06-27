import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    // Setup method: runs before each test
    @Before
    public void setUp() {
        calculator = new Calculator(); // Arrange
        System.out.println("Setup done.");
    }

    // Teardown method: runs after each test
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown done.");
    }

    // Test case 1 
    @Test
    public void testAddition() {
        // Act
        int result = calculator.add(10, 5);

        // Assert
        assertEquals(15, result);
    }

    // Test case 2 
    @Test
    public void testSubtraction() {
        // Act
        int result = calculator.subtract(10, 5);

        // Assert
        assertEquals(5, result);
    }
}
