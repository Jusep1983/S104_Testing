package level2.exercise6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.List;

import org.junit.jupiter.api.Assertions;

public class TestExercise6 {

    ArrayListProof array;

    @BeforeEach
    public void setUp() {
        array = new ArrayListProof();
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        array.getIntegers().addAll(list);
    }

    @Test
    public void givenArrayWithElements_whenAccessingInvalidIndex_thenThrowIndexOutOfBoundsException() {
        Executable executable = () -> array.arrayIndexError(10);
        Assertions.assertThrows(IndexOutOfBoundsException.class, executable);
    }

}
