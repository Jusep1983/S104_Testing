package level3.input;

import level3.exceptions.EmptyInputException;
import level3.exceptions.InvalidCharLengthException;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class KeyboardInput {
    private static final Scanner SC = new Scanner(System.in);

    public static void numberNotEmpty(String input) throws EmptyInputException {
        if (input.isEmpty()) {
            throw new EmptyInputException("el campo no puede estar vacío");
        }
    }

    public static String readInput() {
        return SC.nextLine().trim();
    }

    public static double getDouble(String message) {
        while (true) {
            System.out.print(message);
            try {
                String input = readInput();
                numberNotEmpty(input);
                return Double.parseDouble(input);
            } catch (NullPointerException | NumberFormatException e) {
                System.out.println("Error de formato");
            } catch (EmptyInputException | NoSuchElementException | IllegalStateException e) {
                System.out.println("Error, " + e.getMessage());
            }
        }
    }

    public static char getChar(String message) {
        while (true) {
            try {
                return checkChar(message);
            } catch (EmptyInputException | InvalidCharLengthException
                     | NoSuchElementException | IllegalStateException e) {
                System.out.println("Error, " + e.getMessage());
            }
        }
    }

    public static char checkChar(String message) throws EmptyInputException, InvalidCharLengthException {
        System.out.print(message);
        String inputStr = readInput();
        if (inputStr.isEmpty()) {
            throw new EmptyInputException("el carácter no puede estar vacío");
        } else if (inputStr.length() != 1) {
            throw new InvalidCharLengthException("has de introducir un solo caràcter ");
        } else {
            return inputStr.charAt(0);
        }
    }

}
