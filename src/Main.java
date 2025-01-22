public class Main {
    public static void main(String[] args) {
        Books b1 = new Books("Harry Potter and the Sorcerer's Stone","J. K. Rowling","9781338878929");
        Books b2 = new Books("Harry Potter and the Goblet of Fire","J. K. Rowling","9780545791427");
        Books b3 = new Books("Harry Potter and the Prisoner of Azkaban","J. K. Rowling","9781338815283");
        Books b4 = new Books("The Lord Of The Rings Deluxe Edition"," J. R. R. Tolkien","9780544273443");
        Books b5 = new Books("The Making of Middle-earth","Snyder, Christopher A","9781454944751");
        Books b6 = new Books("Moby-Dick: or, The Whale","Melville, Herman","9780143105954");

        LibraryAdmin la1 = new LibraryAdmin();
        la1.addBook(b1);
        la1.addBook(b2);
        la1.addBook(b3);
        la1.addBook(b4);
        la1.addBook(b5);
        la1.addBook(b6);

        Member m1 = new Member("Aryan Chanana", "aryan.chanana@axeno.co", 1353);
        Member m2 = new Member("Anirudh Pradhan", "anirudh.pradhan@axeno.co", 1363);
        Member m3 = new Member("Fanindra Saini", "fanindra.saini@axeno.co", 1350);

        m1.issueBook(b1);
        m2.issueBook(b2);
        m3.issueBook(b3);
        m1.issueBook(b4);
        m1.issueBook(b4);

        m1.issueBook(b5);
        m1.issueBook(b6);


        System.out.println(LibraryAdmin.noOfBooksIssued);
        la1.removeBook(b2.getISBN());
        la1.removeBook(b3.getISBN());

        la1.displayAvailableBooks();

        System.out.println(b1);
    }
}
