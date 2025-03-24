package level1.exercise1;

import level1.exercise1.model.Library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.AssertionsKt.assertNotNull;

public class TestExercise1 {
    private Library library = new Library();

    @Test
    public void listNotNull() {
        library.addBook("Prueba0");
        assertNotNull(library.getBooks());
        assertFalse(library.getBooks().isEmpty());
    }


    @Test
    public void listSizeCorrect() {
        library.addBook("Prueba1");
        library.addBook("Prueba2");
        library.addBook("Prueba3");
        assertEquals(3, library.getBooks().size());
    }

    @Test
    public void correctPositionBook() {
        library.addBook("Prueba4");
        library.addBook("Prueba5");
        library.addBook("Prueba6");
        library.addBookOnPosition(3, "PruebaPosicion");
        assertTrue(library.getBooks().get(3).getTitle().equalsIgnoreCase("PruebaPosicion"));

    }

    @Test
    public void noDuplicateTitles() {
        library.createSampleDataOfBooks();
        boolean duplicate = false;
        for (int i = 0; i < library.getBooks().size(); i++) {
            for (int j = i + 1; j < library.getBooks().size(); j++) {
                if ((library.getBooks().get(i)).equalsBooks(library.getBooks().get(j))) {
                    duplicate = true;
                }
            }
        }
        assertFalse(duplicate);
    }

    @Test
    public void titleByPosition() {
        library.addBook("Prueba7");
        library.addBook("Prueba8");
        library.addBook("Prueba9");
        library.addBookOnPosition(1, "PruebaPosicion");
        String title = library.getBooks().get(1).getTitle();
        assertEquals("PruebaPosicion", title);
    }

    @Test
    public void listIncreases() {
        int sizeList = library.getBooks().size();
        library.addBook("Prueba10");
        assertEquals(sizeList + 1, library.getBooks().size());
    }

    @Test
    public void listDecreases() {
        library.addBook("1984");
        int sizeList = library.getBooks().size();
        library.removeBookByTitle("1984");
        assertEquals(sizeList - 1, library.getBooks().size());
    }

    @Test
    public void listRemainSorted() {
        library.createSampleDataOfBooks();
        library.removeBookByTitle("La Casa de los Espíritus");
        library.addBook("Em Book");
        assertEquals("1984", library.getBooks().get(0).getTitle());
        assertEquals("Orgullo y Prejuicio", library.getBooks().get(6).getTitle());
    }
}
