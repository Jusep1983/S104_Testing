package level3;

import level3.exceptions.NotDivisibleByZeroException;
import level3.model.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void givenTwoIntegers_whenAddNumbers_thenReturnSum() {
        assertEquals(2, Calculator.addNumbers(1, 1));
    }

    @Test
    public void givenTwoIntegers_whenSubtractNumbers_thenReturnDifference() {
        assertEquals(1, Calculator.subtractNumbers(2, 1));
    }

    @Test
    public void givenTwoIntegers_whenDivideNumbers_thenReturnQuotient() {
        assertEquals(2, Calculator.divideNumbers(8, 4));
    }

    @Test
    public void givenTwoIntegers_whenMultiplyNumbers_thenReturnProduct() {
        assertEquals(25, Calculator.multiplyNumbers(5, 5));
    }

    @Test
    public void givenTwoIntegers_whenModulusNumbers_thenReturnRemainder() {
        assertEquals(0, Calculator.modulusNumbers(25, 5));
    }

    @Test
    void givenDivisionByZero_whenDivideNumbers_thenThrowNotDivisibleByZeroException() {
        Exception exception = assertThrows(NotDivisibleByZeroException.class, () -> Calculator.divideNumbers(10, 0));
        assertEquals("un número no se puede dividir entre 0", exception.getMessage());
    }

    @Test
    void givenDivisionByZero_whenDivideNumbers_thenCatchNotDivisibleByZeroException() {
        try {
            Calculator.divideNumbers(10, 0);
        } catch (NotDivisibleByZeroException e) {
            assertEquals("un número no se puede dividir entre 0", e.getMessage());
        }
    }

}
