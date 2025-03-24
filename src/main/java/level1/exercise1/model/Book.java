package level1.exercise1.model;

public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public boolean equalsBooks(Book newBook) {
        return this.getTitle().equalsIgnoreCase(newBook.getTitle());
    }

    @Override
    public String toString() {
        return "Title: " + title;
    }
}
