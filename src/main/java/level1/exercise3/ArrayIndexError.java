package level1.exercise3;

import java.util.ArrayList;

public class ArrayIndexError {

    public void arrayError(int indexArray, ArrayList<Integer> arrayInts) {
        if (indexArray > arrayInts.size() || indexArray < 0) {
            throw new IndexOutOfBoundsException("indice no existente para el array");
        } else {
            System.out.println("Indice dentro del limite ");
        }
    }

}
