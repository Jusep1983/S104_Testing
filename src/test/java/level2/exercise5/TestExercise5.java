package level2.exercise5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class TestExercise5 {

    ClassMap map;

    @BeforeEach
    public void setUp() {
        map = new ClassMap();
    }

    @Test
    public void givenMapWithSeveralEntries_whenCheckingForSpecificKey_thenKeyIsPresent() {
        map.getPersonsId().put(111, "Jose");
        map.getPersonsId().put(222, "Manuel");
        map.getPersonsId().put(333, "Rakel");
        Assertions.assertThat(map.getPersonsId()).containsKey(222);
        Assertions.assertThat(map.getPersonsId()).containsValue("Jose");
    }

}
