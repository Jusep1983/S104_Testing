package level2.exercise3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExercise3 {

    @Test
    public void arraysEquals() {
        int[] list1 = new int[]{1, 2, 3, 4, 5};
        int[] list2 = new int[]{1, 2, 3, 4, 5};
        Assertions.assertThat(list1).isEqualTo(list2);
        Assertions.assertThat(list1).containsExactly(list2);
    }

}
