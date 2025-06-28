package calculatortest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup done.");
    }
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown done.");
    }
    public void testAddition() {
        int a = 10;
        int b = 5;
        int result = calculator.add(a, b);
        assertEquals(15, result);
    }
    public void testSubtraction() {
        int a = 10;
        int b = 5;
        int result = calculator.subtract(a, b);
        assertEquals(5, result);
    }
    public void testMultiplication() {
        int a = 4;
        int b = 3;
        int result = calculator.multiply(a, b);
        assertEquals(12, result);
    }
    public void testDivision() {
        int a = 20;
        int b = 4;
        int result = calculator.divide(a, b);
        assertEquals(5, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        int a = 10;
        int b = 0;
        calculator.divide(a, b);
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(10, 5));         
        System.out.println("Subtraction: " + calculator.subtract(10, 5));  
        System.out.println("Multiplication: " + calculator.multiply(4, 3)); 
        try {
            System.out.println("Division: " + calculator.divide(20, 4));     
            System.out.println("Division by Zero: " + calculator.divide(10, 0)); 
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
