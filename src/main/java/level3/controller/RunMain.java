package level3.controller;

import level3.input.KeyboardInput;

import static level3.model.Calculator.*;

public class RunMain {

    public static void startCalculatorApp() {
        double result = 0;
        boolean correct = false;
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
                    result = divideNumbers(firstNum, secondNum);
                    correct = true;
                    break;
                case '*':
                    result = multiplyNumbers(firstNum, secondNum);
                    correct = true;
                    break;
                case '+':
                    result = addNumbers(firstNum, secondNum);
                    correct = true;

                    break;
                case '-':
                    result = subtractNumbers(firstNum, secondNum);
                    correct = true;
                    break;
                case '%':
                    result = modulusNumbers(firstNum, secondNum);
                    correct = true;
                    break;
                default:
                    System.out.println("El carácter introducido no se corresponde con ningún operador. ");

            }
        } while (!correct);

        if (!((secondNum == 0) && (operator == '/'))) {
            System.out.println("El resultado és: " + result);
        }
    }
}
