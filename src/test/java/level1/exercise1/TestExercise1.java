package level1.exercise1;

import level1.exercise1.model.Book;
import level1.exercise1.model.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.AssertionsKt.assertNotNull;

public class TestExercise1 {

    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
        library.createSampleDataOfBooks();
        library.addBookOnPosition(3, "PruebaPosicion");
    }

    @Test
    public void givenLibrary_whenCreateSampleData_thenBooksListIsNotNullAndNotEmpty() {
        assertNotNull(library.getBooks());
        assertFalse(library.getBooks().isEmpty());
    }


    @Test
    public void givenSampleData_whenGetBookList_thenListSizeIs8() {
        assertEquals(8, library.getBooks().size());
    }

    @Test
    public void givenBookInsertedAtPosition3_whenGetBookAtPosition3_thenReturnsExpectedTitle() {
        assertTrue(library.getBooks().get(3).getTitle().equalsIgnoreCase("PruebaPosicion"));
    }

    @Test
    public void givenBooksList_whenConvertToSet_thenNoDuplicateTitlesExist() {
        List<Book> books = library.getBooks();
        Set<Book> librosUnicos = new HashSet<>(books);
        assertEquals(books.size(), librosUnicos.size(), "Hay libros repetidos");
    }

    @Test
    public void givenLibraryWithBookAtPosition3_whenGetTitleAtPosition3_thenReturnsCorrectTitle() {
        String title = library.getBooks().get(3).getTitle();
        assertEquals("PruebaPosicion", title);
    }

    @Test
    public void givenBooksList_whenAddNewBook_thenListSizeIncreasesByOne() {
        int sizeList = library.getBooks().size();
        library.addBook("Prueba");
        assertEquals(sizeList + 1, library.getBooks().size());
    }

    @Test
    public void givenBooksList_whenRemoveExistingBook_thenListSizeDecreasesByOne() {
        int sizeList = library.getBooks().size();
        library.removeBookByTitle("1984");
        assertEquals(sizeList - 1, library.getBooks().size());
    }

    @Test
    public void givenSortedBooksList_whenRemoveAndAddBooks_thenListRemainsSorted() {
        library.removeBookByTitle("La Casa de los Espíritus");
        library.addBook("Em Book");
        assertEquals("1984", library.getBooks().get(0).getTitle());
        assertEquals("Orgullo y Prejuicio", library.getBooks().get(6).getTitle());
        assertEquals("Em Book", library.getBooks().get(4).getTitle());
    }
}
