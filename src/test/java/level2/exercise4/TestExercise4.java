package level2.exercise4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestExercise4 {

    @Test
    public void listContainsOrderObjects() {
        ArrayList<Object> objects = new ArrayList<>();
        Car c1 = new Car("Renault");
        Car c2 = new Car("Ford");
        Motorbike m1 = new Motorbike("Honda");
        Motorbike m2 = new Motorbike("Ducati");
        objects.add(c1);
        objects.add(c2);
        objects.add(m1);
        objects.add(m2);
        Assertions.assertThat(objects).containsExactly(c1, c2, m1, m2);
    }

    @Test
    public void listContainsObjects() {
        ArrayList<Object> objects = new ArrayList<>();
        Car c1 = new Car("Renault");
        Car c2 = new Car("Ford");
        Motorbike m1 = new Motorbike("Honda");
        Motorbike m2 = new Motorbike("Ducati");
        objects.add(c1);
        objects.add(c2);
        objects.add(m1);
        objects.add(m2);
        Assertions.assertThat(objects).contains(m1, c2, c1, m2);
    }

    @Test
    public void listContainsAElement() {
        ArrayList<Object> objects = new ArrayList<>();
        Car c1 = new Car("Renault");
        Car c2 = new Car("Ford");
        Motorbike m1 = new Motorbike("Honda");
        Motorbike m2 = new Motorbike("Ducati");
        objects.add(c1);
        objects.add(c2);
        objects.add(m1);
        objects.add(m2);
        Assertions.assertThat(objects).containsOnlyOnce(m1);
    }

    @Test
    public void listNoContainsAElement() {
        ArrayList<Object> objects = new ArrayList<>();
        Car c1 = new Car("Renault");
        Car c2 = new Car("Ford");
        Motorbike m1 = new Motorbike("Honda");
        Motorbike m2 = new Motorbike("Ducati");
        objects.add(c2);
        objects.add(m1);
        objects.add(m2);
        Assertions.assertThat(objects).doesNotContain(c1);
    }

}
