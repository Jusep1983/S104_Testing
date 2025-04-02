package level3.controller;

import level3.exceptions.NotDivisibleByZero;
import level3.input.KeyboardInput;

import static level3.model.Calculator.*;

public class RunMain {

    public static void startCalculatorApp() {
        double result = 0;
        boolean exit = false;
        char operator;
        double firstNum = KeyboardInput.readDouble("Introduce un primer numero: ");

        double secondNum = KeyboardInput.readDouble("Introduce un segundo numero: ");

        do {
            operator = KeyboardInput.readChar("""
                    Elige que operación quieres hacer entre ellos:
                    / para dividir
                    * para multiplicar
                    + para sumar
                    - para restar
                    % para módulo
                    """);

            switch (operator) {
                case '/':
                    try {
                        result = divideNumbers(firstNum, secondNum);
                        exit = true;
                    } catch (NotDivisibleByZero e) {
                        System.out.println("Error, " + e.getMessage());
                        exit = true;
                    }
                    break;
                case '*':
                    result = multiplyNumbers(firstNum, secondNum);
                    exit = true;
                    break;
                case '+':
                    result = addNumbers(firstNum, secondNum);
                    exit = true;

                    break;
                case '-':
                    result = subtractNumbers(firstNum, secondNum);
                    exit = true;
                    break;
                case '%':
                    result = modulusNumbers(firstNum, secondNum);
                    exit = true;
                    break;
                default:
                    System.out.println("El carácter introducido no se corresponde con ningún operador. ");

            }
        } while (!exit);

        if (!((secondNum == 0) && (operator == '/'))) {
            System.out.println("El resultado és: " + result);
        }
    }
}
