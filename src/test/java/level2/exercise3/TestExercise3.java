package level2.exercise3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestExercise3 {

    int[] list1;
    int[] list2;

    @BeforeEach
    public void setUp() {
        list1 = new int[]{1, 2, 3, 4, 5};
        list2 = new int[]{1, 2, 3, 4, 5};
    }

    @Test
    public void givenTwoIdenticalArrays_whenComparingWithEquals_thenTheyAreEqual() {
        Assertions.assertThat(list1).isEqualTo(list2);
    }

    @Test
    public void givenTwoIdenticalArrays_whenCheckingContents_thenTheyContainExactlyTheSameElements() {
        Assertions.assertThat(list1).containsExactly(list2);
    }

}
