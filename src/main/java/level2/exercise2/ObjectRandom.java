package level2.exercise2;

import java.util.Objects;

public class ObjectRandom {
    private int idObject;

    public ObjectRandom(int idObject) {
        this.idObject = idObject;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ObjectRandom that = (ObjectRandom) o;
        return idObject == that.idObject;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idObject);
    }

    @Override
    public String toString() {
        return "ObjectRandom{idObject:" + this.idObject;
    }

}
