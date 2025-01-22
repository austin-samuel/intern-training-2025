package session3;

import java.util.ArrayList;
import java.util.List;

public class LibraryAdmin implements Librarian {

    List<Book> bookList = new ArrayList<>();
    @Override
    public void addBook(Book book) {
        bookList.add(book);
    }

    @Override
    public void removeBook(String ISBN) {
        for (Book book: bookList) {
            if (book.getISBN().equals(ISBN)) {
                bookList.remove(book);
                break;
            }
        }
//        bookList.removeIf(book -> book.getISBN().equals(ISBN));

    }

    @Override
    public void displayAvailableBooks() {
        for (Book book: bookList) {
            if (!book.getIsIssued()) {
                System.out.println(book);
            }
        }
    }
}
