package model;

import java.util.ArrayList;
import java.util.List;

public class LibraryAdmin implements Librarian {

    public static int totalBookIssued;
    static List<Book> bookList = new ArrayList<>();

    // Add a book to the library
    @Override
    public void addBook(Book book) {
        bookList.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Remove a book by ISBN
    @Override
    public void removeBook(String ISBN) {
        boolean bookFound = false;
        for (Book book : bookList) {
            if (book.getISBN().equals(ISBN)) {
                bookList.remove(book);
                System.out.println("Book removed: " + book.getTitle());
                bookFound = true;
                break;
            }
        }
        if (!bookFound) {
            System.out.println("No book found with ISBN: " + ISBN);
        }
    }

    // Display all available books
    @Override
    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : bookList) {
            if (!book.getIsIssued()) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getISBN());
            }
        }
    }
}

