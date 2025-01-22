import java.util.ArrayList;
import java.util.List;

public class LibraryAdmin implements Librarian{
    private List<Book> books;
    public LibraryAdmin() {
        this.books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added: "+ book);
    }


    @Override
    public void removeBook(String ISBN) {
        boolean removed = books.removeIf(book -> book.getISBN().equals(ISBN));
        if (removed) {
            System.out.println("Book with ISBN " + ISBN + " removed.");
        } else {
            System.out.println("No book found with ISBN" + ISBN + ".");
        }
    }

    @Override
    public void displayAvailableBooks() {
        System.out.println("Available books:");
        for (Book book : books) {
            if (!book.isIssued()) {
                System.out.println(book);
            }
        }
    }


}
