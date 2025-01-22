class Member extends Person {
    private int memberId;
    private int issuedBooksCount=0;


    public Member(String name, String email, int memberId)
    {
        super(name,email);
        this.memberId=memberId;

    }
    public void issueBook(Book book)
    {
        if(issuedBooksCount>3)
        {
            System.out.println("Sorry the limit of"+this.name+" is reached!");
        }
        else
        {
            System.out.println("Congratulations!"+this.name+" got your book of name"+book.getTitle()+" is issued");
            issuedBooksCount++;
            LibraryAdmin.issued_book++;
            System.out.println("Your current issue account is: "+issuedBooksCount);
        }
    }
}
