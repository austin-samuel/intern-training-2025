import java.util.ArrayList;

public class LibraryAdmin implements Librarian{
    private final ArrayList<Books> catalogue = new ArrayList<>();
    public static int noOfBooksIssued = 0;

    @Override
    public void addBook(Books book) {
        catalogue.add(book);
    }

    @Override
    public void removeBook(String ISBN) {
        for(Books book : catalogue){
            if(book.getISBN().equals(ISBN)){
                catalogue.remove(book);
                System.out.println("removed");
                break;
            }
        }
    }

    @Override
    public void displayAvailableBooks() {
        for(Books book : catalogue) {
            if (!book.getIsIssued())
//                System.out.println(book.getTitle() + " | " + book.getAuthor() + " | " + book.getISBN());
                System.out.println(book);
        }
    }
}
