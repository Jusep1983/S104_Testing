package level3.model;

import level3.exceptions.NotDivisibleByZero;

public class Calculator {

    public Calculator() {
    }

    public static double divideNumbers(double firstNumber, double secondNumber) {
            double result = 0;
        try {
            if (secondNumber == 0) {
                throw new NotDivisibleByZero("un número no se puede dividir entre 0 ");
            } else {
                result = firstNumber / secondNumber;
                result = (Math.round(result * 100.0) / 100.0);
            }
        }catch(NotDivisibleByZero e) {
            System.out.println("Error, " + e.getMessage());
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
