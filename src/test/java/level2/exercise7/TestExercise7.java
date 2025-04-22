package level2.exercise7;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExercise7 {

    ObjectOptional objectOptional = new ObjectOptional();

    @Test
    public void givenEmptyObject_whenCheckingIfObjectIsEmpty_thenReturnEmpty() {
        Assertions.assertThat(objectOptional.objectEmpty()).isEmpty();
    }

}
