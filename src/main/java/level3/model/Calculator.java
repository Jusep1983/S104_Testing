package level3.model;

import level3.exceptions.NotDivisibleByZeroException;

public class Calculator {

    public Calculator() {
    }

    public static double divideNumbers(double firstNumber, double secondNumber)throws NotDivisibleByZeroException {
            double result;
            if (secondNumber == 0) {
                throw new NotDivisibleByZeroException("un número no se puede dividir entre 0");
            } else {
                result = firstNumber / secondNumber;
                result = (Math.round(result * 100.0) / 100.0);
            }
        return result;
    }

    public static double multiplyNumbers(double firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        result = (Math.round(result * 100.0) / 100.0);
        return result;
    }

    public static double addNumbers(double firstNumber, double secondNumber) {
        double result = firstNumber + secondNumber;
        result = (Math.round(result * 100.0) / 100.0);
        return result;
    }

    public static double subtractNumbers(double firstNumber, double secondNumber) {
        double result = firstNumber - secondNumber;
        result = (Math.round(result * 100.0) / 100.0);
        return result;
    }

    public static double modulusNumbers(double firstNumber, double secondNumber) {
        double result = firstNumber % secondNumber;
        result = (Math.round(result * 100.0) / 100.0);
        return result;
    }
}
