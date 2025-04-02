package level1.exercise2;

import java.util.ArrayList;
import java.util.Arrays;

public class DniCalculation {

    public static char dniLetter(int dniNumber) {
        ArrayList<Character> lettersDni = new ArrayList<>(Arrays.asList('T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P',
                'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'));
        String dniNumberStr = String.valueOf(dniNumber);
        char dniLetter;
        int attempts = 0;
        do {
            if (dniNumberStr.length() != 8) {
                System.out.println("el numero ha de tener 8 cifras ");
                dniLetter = '\0';
                attempts++;
            } else {
                dniLetter = lettersDni.get(dniNumber % 23);
            }
        } while ((dniNumberStr.length()) != 8 && (attempts < 3));
        return dniLetter;

    }
}
