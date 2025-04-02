package level2.exercise2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestExercise2 {

    @Test
    public void objectRandomEquals() {
        level2.exercise2.ObjectRandom obj1 = new ObjectRandom(1);
        level2.exercise2.ObjectRandom obj2 = new ObjectRandom(1);
        assertThat(obj1).isEqualTo(obj2);
    }

    @Test
    public void objectRandomNotEquals() {
        level2.exercise2.ObjectRandom obj1 = new ObjectRandom(1);
        level2.exercise2.ObjectRandom obj2 = new ObjectRandom(2);
        assertThat(obj1).isNotEqualTo(obj2);
    }
}
