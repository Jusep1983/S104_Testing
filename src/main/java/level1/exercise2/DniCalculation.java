package level1.exercise2;

import java.util.ArrayList;
import java.util.Arrays;

public class DniCalculation {

    public static char dniLetter(int dniNumber) {
        ArrayList<Character> lettersDni = new ArrayList<>(Arrays.asList('T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P',
                'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'));
        String dniNumberStr = String.valueOf(dniNumber);
        char dniLetter = 0;
        try {
            if (dniNumberStr.length() != 8) {
                throw new IllegalArgumentException("el numero ha de tener 8 cifras ");
            }
            dniLetter = lettersDni.get(dniNumber % 23);
        } catch (IllegalArgumentException e) {
            System.out.println("Error, " + e.getMessage());
        }
        return dniLetter;
    }
}
