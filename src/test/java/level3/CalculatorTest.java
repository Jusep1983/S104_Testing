package level3;

import level3.exceptions.NotDivisibleByZero;
import level3.model.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void addNumbersTest() {
        assertEquals(2, Calculator.addNumbers(1, 1));
    }

    @Test
    public void subtractNumbersTest() {
        assertEquals(1, Calculator.subtractNumbers(2, 1));
    }

    @Test
    public void divideNumbersTest() {
        assertEquals(2, Calculator.divideNumbers(8, 4));
    }

    @Test
    public void multiplyNumbersTest() {
        assertEquals(25, Calculator.multiplyNumbers(5, 5));
    }

    @Test
    public void modulusNumbersTest() {
        assertEquals(0, Calculator.modulusNumbers(25, 5));
    }

    @Test
    void testNotDivisibleByZero() {
        Exception exception = assertThrows(NotDivisibleByZero.class, () -> Calculator.divideNumbers(10, 0));
        assertEquals("un número no se puede dividir entre 0", exception.getMessage());
    }

    @Test
    void secondTestNotDivisibleByZero() {
        try {
            Calculator.divideNumbers(10, 0);
        } catch (NotDivisibleByZero e) {
            assertEquals("un número no se puede dividir entre 0", e.getMessage());
        }
    }
}
