package level1.exercise1;

import level1.exercise1.model.Library;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.AssertionsKt.assertNotNull;

public class TestExercise1 {
    private static Library library = new Library();


    @BeforeAll
    static void iniciar() {
        library.createSampleDataOfBooks();
    }

    @Test
    public void listNotNull() {
        assertNotNull(library.getBooks());
        assertFalse(library.getBooks().isEmpty());
    }


    @Test
    public void listSizeCorrect() {
        int counter = 0;
        for (int i = 0; i < library.getBooks().size(); i++) {
            counter++;
        }
        assertEquals(counter, library.getBooks().size());
    }

    @Test
    public void correctPositionBook() {
        library.addBookOnPosition(3, "PruebaPosicion");
        assertTrue(library.getBooks().get(3).getTitle().equalsIgnoreCase("PruebaPosicion"));
        library.removeBookByTitle("PruebaPosicion");
    }

    @Test
    public void noDuplicateTitles() {
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
        library.addBookOnPosition(1, "PruebaPosicion");
        String title = library.getBooks().get(1).getTitle();
        assertEquals("PruebaPosicion", title);
        library.removeBookByTitle("PruebaPosicion");
    }

    @Test
    public void listIncreases() {
        int sizeList = library.getBooks().size();
        library.addBook("Prueba10");
        assertEquals(sizeList + 1, library.getBooks().size());
        library.removeBookByTitle("Prueba10");
    }

    @Test
    public void listDecreases() {
        library.addBook("Prueba");
        int sizeList = library.getBooks().size();
        library.removeBookByTitle("1984");
        assertEquals(sizeList - 1, library.getBooks().size());
    }

    @Test
    public void listRemainSorted() {
        library.removeBookByTitle("La Casa de los Espíritus");
        library.addBook("Em Book");
        assertEquals("1984", library.getBooks().get(0).getTitle());
        assertEquals("Orgullo y Prejuicio", library.getBooks().get(6).getTitle());
        assertEquals("Em Book", library.getBooks().get(4).getTitle());
    }
}
