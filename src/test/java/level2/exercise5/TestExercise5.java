package level2.exercise5;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class TestExercise5 {

    @Test
    public void mapContainsOneKey() {
        ClassMap map = new ClassMap();
        map.getPersonsId().put(111, "Jose");
        map.getPersonsId().put(222, "Manuel");
        map.getPersonsId().put(333, "Rakel");
        Assertions.assertThat(map.getPersonsId()).containsKey(222);
        Assertions.assertThat(map.getPersonsId()).containsValue("Jose");
    }

}
