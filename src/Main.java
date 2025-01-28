public class Main {
    public static void main(String[] args) {
        LibraryAdmin admin= new LibraryAdmin();
        Book book1= new Book("Famous Five", "ABC", "1234567890");
        Book book2=new Book("1984", "George Orwell", "1212121212");
        Book book3= new Book("Little Women", "XYZ", "1122334455");
        Book book4=new Book("Jane Eyre", "Bronte", "9876654321");

        admin.addBook(book1);
        admin.addBook(book2);
        admin.addBook(book3);
        admin.addBook(book4);

        admin.displayAvailableBooks();

        Member member1= new Member("John Doe","john.doe@example.com",1);

        System.out.println("\nBooks Issued:");
        member1.issueBook(book1);
        member1.issueBook(book2);
         member1.issueBook(book3);
        member1.issueBook(book1);

        admin.displayAvailableBooks();

        System.out.println("\nTotal books issued: " + Member.getTotalBooksIssued());

        System.out.println("\nRemoving a Book: ");
        admin.removeBook("1212121212");

        admin.displayAvailableBooks();
    }
}
