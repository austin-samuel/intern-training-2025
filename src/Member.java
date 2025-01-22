public class Member extends Person{
    private  int memberId;
    private int issuedBooksCount;
    public Member(String name,String email,int memberId)
    {
        super(name,email);
        this.memberId=memberId;
        this.issuedBooksCount=0;
    }
    public int getMemberId()
    {
        return memberId;
    }
    public void issueBook(Book book)
    {
        if(issuedBooksCount<3)
        {
           if(!book.getIsIssued())
           {
               book.issueBook();
               issuedBooksCount++;
           }
           else
           {
               System.out.println("the book "+book.getTitle()+" is already issued");
           }
        }
        else {
            System.out.println("issuing limit has been reached for "+name);
        }
    }
}
