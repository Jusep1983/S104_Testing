package level2.exercise1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestExercise1 {

    @Test
    public void objectRandomValuesEquals() {
        level2.exercise1.ObjectRandom obj1 = new ObjectRandom(1);
        level2.exercise1.ObjectRandom obj2 = new ObjectRandom(1);
        assertThat(obj1.getIdObject()).isEqualTo(obj2.getIdObject());
    }

    @Test
    public void objectRandomValuesNotEquals() {
        level2.exercise1.ObjectRandom obj1 = new ObjectRandom(1);
        level2.exercise1.ObjectRandom obj2 = new ObjectRandom(2);
        assertThat(obj1.getIdObject()).isNotEqualTo(obj2.getIdObject());
    }

}
