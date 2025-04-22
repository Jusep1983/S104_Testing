package level2.exercise1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestExercise1 {

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
    public void givenTwoObjectsWithSameId_whenComparingIds_thenTheyAreEqual() {
        assertThat(objA.getIdObject()).isEqualTo(objB.getIdObject());
    }

    @Test
    public void givenTwoObjectsWithDifferentId_whenComparingIds_thenTheyAreNotEqual() {
        assertThat(objA.getIdObject()).isNotEqualTo(objC.getIdObject());
    }

}
