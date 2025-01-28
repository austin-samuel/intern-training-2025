 import java.util.List;
import java.util.ArrayList;
class LibraryAdmin  implements Librarian{
    private List<Book>books;
    //initialising the constructor of list
    public LibraryAdmin()
    {
        books=new ArrayList<>();
    }
    public List<Book> getBooks() {
        return books;
    }
    @Override
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book " + book.getTitle() + " has been added to the library");
    }
    @Override
    public void removeBook(String ISBN)
    {
        if (books.isEmpty()) {
            System.out.println("The library is empty. No book can be removed.");
            return;
        }
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getISBN().equals(ISBN)) {
                books.remove(i);
                System.out.println("Book with ISBN " + ISBN + " has been removed");
                return;
            }
        }
        //IF INVALID ISBN
        System.out.println("No book with ISBN " + ISBN + " found in the library.");
    }

    @Override
    public void DisplayAvailableBooks() {
        if (books.isEmpty()) {
            System.out.println("No books are available in the library.");
            return;
        }
        System.out.println("Available books present in the library are :");
        for(Book book:books)
        {
            if(!book.getIsIssued())
            {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getISBN());

            }
        }
    }
}
