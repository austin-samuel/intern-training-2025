package model;

public interface Librarian {

    void addBook(Book book);

    void removeBook(String ISBN);

    void displayAvailableBooks();
}
