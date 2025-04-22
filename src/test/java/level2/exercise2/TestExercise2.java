package level2.exercise2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestExercise2 {

    ObjectRandom objA;
    ObjectRandom objB;
    ObjectRandom objC;

    @BeforeEach
    public void setUp() {
        objA = new ObjectRandom(1);
        objB = new ObjectRandom(1);
        objC = new ObjectRandom(2);
    }

    @Test
    public void givenTwoObjectsWithSameId_whenComparingWithMethodEquals_thenTheyAreEqual() {
        assertThat(objA).isEqualTo(objB);
    }

    @Test
    public void givenTwoObjectsWithDifferentId_whenComparingWithMethodEquals_thenTheyAreNotEqual() {
        assertThat(objA).isNotEqualTo(objC);
    }

}
