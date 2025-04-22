package level1.exercise3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestArrayIndexOutOfBoundsException {

    ArrayIndexError emptyArrayList = new ArrayIndexError();

    @Test
    public void givenEmptyArray_whenAccessingIndex_thenThrowsIndexOutOfBoundsException() {
        ArrayList<Integer> array = new ArrayList<>();
        Executable executable = () -> emptyArrayList.arrayError(1, array);
        assertThrows(IndexOutOfBoundsException.class, executable);
    }

}
