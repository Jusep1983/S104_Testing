package level2.exercise4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestExercise4 {

    Car carRenault;
    Car carFord;
    Motorbike motoHonda;
    Motorbike motoDucati;
    ArrayList<Object> objects;

    @BeforeEach
    public void setUp() {
        objects = new ArrayList<>();
        carRenault = new Car("Renault");
        carFord = new Car("Ford");
        motoHonda = new Motorbike("Honda");
        motoDucati = new Motorbike("Ducati");
    }

    @Test
    public void givenListOfObjects_whenCheckingOrder_thenObjectsAreInExactOrder() {
        objects.add(carRenault);
        objects.add(carFord);
        objects.add(motoHonda);
        objects.add(motoDucati);
        Assertions.assertThat(objects).containsExactly(carRenault, carFord, motoHonda, motoDucati);
    }

    @Test
    public void givenListOfObjects_whenCheckingContent_thenObjectsAreContainedRegardlessOfOrder() {
        objects.add(carRenault);
        objects.add(carFord);
        objects.add(motoHonda);
        objects.add(motoDucati);
        Assertions.assertThat(objects).contains(motoHonda, carFord, carRenault, motoDucati);
    }

    @Test
    public void givenListOfObjects_whenCheckingSingleElement_thenElementIsContainedOnce() {
        objects.add(carRenault);
        objects.add(carFord);
        objects.add(motoHonda);
        objects.add(motoDucati);
        Assertions.assertThat(objects).containsOnlyOnce(motoHonda);
    }

    @Test
    public void givenListOfObjects_whenCheckingForAbsence_thenElementIsNotContained() {
        objects.add(carFord);
        objects.add(motoHonda);
        objects.add(motoDucati);
        Assertions.assertThat(objects).doesNotContain(carRenault);
    }

}
