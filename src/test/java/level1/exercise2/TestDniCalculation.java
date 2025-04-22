package level1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestDniCalculation {

    @ParameterizedTest
    @CsvSource({
            "12345678,Z",
            "87654321,X",
            "11223344,B",
            "55667788,Z",
            "74246722,P",
            "39383352,S",
            "55555555,K",
            "69967049,Z",
            "11111111,H",
            "22222222,J"
    })

    public void givenDniNumber_whenCalculateLetter_thenReturnCorrectLetter(int dniNumber, char correctLetter) {
        char letter = DniCalculation.dniLetter(dniNumber);
        Assertions.assertEquals(correctLetter, letter);
    }

}
