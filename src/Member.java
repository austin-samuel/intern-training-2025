package session3;

public class Member extends Person {
    int memberId;
    static int totalBooksIssued = 0;
    int issuedBooksCount = 0;

    void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    int getMemberId() {
        return memberId;
    }

    int getTotalBooksIssued() {
        return totalBooksIssued;
    }

    void issueBook(Book book) {
        if (issuedBooksCount == 3) {
            System.out.println("Limit has been reached for memberId " + memberId);
            return;
        }
        book.issueBook();
        totalBooksIssued++;
        issuedBooksCount++;
    }
}
