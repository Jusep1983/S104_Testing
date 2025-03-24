package level1.exercise1.model;

import java.util.ArrayList;
import java.util.Comparator;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(String title) {
        Book newBook = new Book(title);
        this.books.add(newBook);
        this.books.sort(Comparator.comparing(Book::getTitle));
    }

    public void createSampleDataOfBooks() {
        this.addBook("Cien Años de Soledad");
        this.addBook("1984");
        this.addBook("El Principito");
        this.addBook("La Casa de los Espíritus");
        this.addBook("Fahrenheit 451");
        this.addBook("Don Quijote de la Mancha");
        this.addBook("Orgullo y Prejuicio");
    }

    public void showListOfBooks() {
        System.out.println();
        for (Book book : this.books) {
            System.out.println("\t" + book);
        }
    }

    public void addBookOnPosition(int position, String title) {
        Book newBook = new Book(title);
        try {
            if (this.books == null) {
                throw new IllegalStateException("la lista de libros no ha sido inicializada.");
            }
            if (position < 0 || position > this.books.size()) {
                throw new IndexOutOfBoundsException("posición fuera de los límites: " + position);
            }
            this.books.add(position, newBook);
        } catch (IllegalStateException | IndexOutOfBoundsException e) {
            System.out.println("Error, " + e.getMessage());
        }
    }

    public void removeBookByTitle(String title) {
        boolean found = false;
        int i = 0;
        while (i < this.books.size() && !found) {
            if (this.books.get(i).getTitle().equalsIgnoreCase(title)) {
                this.books.remove(i);
                this.books.sort(Comparator.comparing(Book::getTitle));
                found = true;
            }
            i++;
        }
    }

}
