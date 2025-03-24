package level3.input;

import level3.exceptions.EmptyInputException;
import level3.exceptions.InvalidCharLengthException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KeyboardInput {
    private static final Scanner SC = new Scanner(System.in);

    public static double readDouble(String message) {
        double number = 0.0;
        boolean correct = false;
        do {
            System.out.print(message);
            try {
                number = SC.nextDouble();
                correct = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato");
            }
            SC.nextLine();
        } while (!correct);
        return number;
    }

    public static char readChar(String message) {
        String inputStr;
        char character = ' ';
        boolean correct = false;
        do {
            System.out.print(message);
            try {
                inputStr = SC.nextLine();
                if (inputStr.isEmpty()) {
                    throw new EmptyInputException("el carácter no puede estar vacío");
                } else if (inputStr.length() != 1) {
                    throw new InvalidCharLengthException("has de introducir un solo caràcter ");
                }
                character = inputStr.charAt(0);
                correct = true;
            } catch (EmptyInputException | InvalidCharLengthException e) {
                System.out.println("Error, " + e.getMessage());
            }
        } while (!correct);
        return character;
    }

}
