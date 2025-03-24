package level2.exercise6;

import java.util.ArrayList;

public class ArrayListProof {
    private ArrayList<Integer> integers;

    public ArrayListProof() {
        this.integers = new ArrayList<>();
    }

    public ArrayList<Integer> getIntegers() {
        return this.integers;
    }

    public void arrayIndexError(int index) {
        if (index < 0 || index > this.integers.size()) {
            throw new IndexOutOfBoundsException("indice no existente para el array");
        } else {
            System.out.println("Indice correcto");
        }
    }

    @Override
    public String toString() {
        return "ArrayListProof{" +
               "integers=" + this.integers +
               '}';
    }
}
