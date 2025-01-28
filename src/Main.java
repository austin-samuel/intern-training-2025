package session3;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Book1", "Me", "1234", false);
        Book b2 = new Book("Book2", "Me", "2345", false);
        Book b3 = new Book("Book3", " Not Me", "3456", false);
        Book b4 = new Book("Book4", "Me", "4567", false);
        Book b5 = new Book("Book5", "Not Me", "5678", false);
        Book b6 = new Book("Book6", "Me", "6789", false);
        Book b7 = new Book("Book7", "Not Me", "7890", false);
        Book b8 = new Book("Book8", "Not Me", "8901", false);
        Member m1 = new Member();
        m1.setMemberId(1);
        m1.setName("Aryan");
        m1.setEmail("a1@gmail.com");
        Member m2 = new Member();
        m2.setMemberId(2);
        m2.setName("Mayank");
        m2.setEmail("m2@gmail.com");
        Member m3 = new Member();
        m3.setMemberId(1);
        m3.setName("Gaurav");
        m3.setEmail("g1@gmail.com");

        LibraryAdmin admin = new LibraryAdmin();
        admin.addBook(b1);
        admin.addBook(b2);
        admin.addBook(b3);
        admin.addBook(b4);
        admin.addBook(b5);
        admin.addBook(b6);
        admin.addBook(b7);
        admin.addBook(b8);

        m1.issueBook(b1);
        m1.issueBook(b2);
        m1.issueBook(b3);
        m1.issueBook(b4);
        m2.issueBook(b2);
        m2.issueBook(b4);
        m2.issueBook(b5);

        System.out.println();
        System.out.println("Remaining books: ");
        admin.displayAvailableBooks();

        System.out.println("Total books issued = " + m1.getTotalBooksIssued());

        admin.removeBook(b7.getISBN());

        System.out.println();
        System.out.println("Remaining books: ");
        admin.displayAvailableBooks();
    }
}
