public class Member extends Person{
    private int memberId;
    private int issuedBooksCount;
    private static int totalBooksIssued = 0;

    public Member(String name, String email, int memberId)
    {
        super(name, email);
        this.memberId= memberId;
        this.issuedBooksCount= 0;
    }

    public void issueBook(Book book){
        if(issuedBooksCount< 3){
            if(!book.isIssued()){
                book.issueBook();
                issuedBooksCount++;
                totalBooksIssued++;
                System.out.println("Member \"" + name + "\" now has " + issuedBooksCount + " books issued.");
            }
            else{
                System.out.println("The book \"" + book.getTitle() + "\" is already issued.");
            }
        }
        else{
            System.out.println("The member \"" + name + "\" has reached the maximum limit of issued books.");
        }
    }
    public static int getTotalBooksIssued(){
        return totalBooksIssued;
    }
}
