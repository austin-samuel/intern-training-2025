import java.util.*;
public class LibraryAdmin implements Librarian{
    List<Book> myList=new ArrayList<>();
    public static int issued_book=0;
    Scanner sc=new Scanner(System.in);
    public void addBook(Book book)
    {
                myList.add(book);
                System.out.println("Book of "+book.getTitle()+" is added");
    }

    public void removeBook(Book book)
    {
        String ISBN= book.getISBN();
        for(int i=0;i<myList.size();i++)
        {
            if(myList.get(i).getISBN()==ISBN)
            {
                myList.remove(myList.get(i));
                System.out.println("Successfully removed the book");
            }
            else System.out.println("Couldn't find the book");
        }

    }
    public void displayAvailableBooks()
    {
        int cnt=1;


        System.out.println(myList.size());
        for(int i=0;i<myList.size();i++)
        {
            if (myList.get(i).getIssued() != false) {
                continue;
            }
            System.out.println("Detail of "+cnt+" book");
            System.out.println("Title: "+myList.get(i).getTitle());
            System.out.println("Author"+myList.get(i).getAuthor());
            System.out.println("ISBN number is"+myList.get(i).getISBN());
            cnt++;
        }
    }

}
