import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
          Book b1=new Book("Hallow","Aditya","1234");
          Book b2=new Book("Investor", "Dal carnegie","0000");
          Book b3=new Book("Wolf","Charles","2341");
          Book b4=new Book("Money","Adi","3412");

          LibraryAdmin lb=new LibraryAdmin();
          lb.addBook(b1);
          lb.addBook(b2);
          lb.addBook(b3);
          lb.addBook(b4);

          Member m1=new Member("Aditya","aditya@gmail.com",123);
          Member m2=new Member("Tarun","tarun!gmail.com",234);

          m1.issueBook(b1);
          m1.issueBook(b2);
          m2.issueBook(b3);

          lb.displayAvailableBooks();

        String bonus1 = b1.toString();
        System.out.println(bonus1);

        System.out.println(b2);
        System.out.println(LibraryAdmin.issued_book);
    }
}
