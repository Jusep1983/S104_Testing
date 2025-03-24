package level3;

import level3.model.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {

    @Test
    public void addNumbersTest() {
        Assertions.assertEquals(2, Calculator.addNumbers(1, 1));
    }

    @Test
    public void subtractNumbersTest() {
        Assertions.assertEquals(1, Calculator.subtractNumbers(2, 1));
    }

    @Test
    public void divideNumbersTest() {
        Assertions.assertEquals(2, Calculator.divideNumbers(8, 4));
    }

    @Test
    public void multiplyNumbersTest() {
        Assertions.assertEquals(25, Calculator.multiplyNumbers(5, 5));
    }

    @Test
    public void modulusNumbersTest() {
        Assertions.assertEquals(0, Calculator.modulusNumbers(25, 5));
    }

}
