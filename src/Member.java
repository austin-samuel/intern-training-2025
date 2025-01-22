import java.awt.print.Book;

class Member extends Person{
    private int memberId;
    private int issuedBooksCount = 0;

    Member(String name, String email, int memberId){
        super(name,email);
        this.memberId = memberId;
    }

    void issueBook(Books book){
        if(issuedBooksCount<3){
            book.issueBook();
            LibraryAdmin.noOfBooksIssued++;
            issuedBooksCount++;
        }
        else{
            System.out.println("The Limit has been Reached.");
        }
    }
}
