public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isIssued=false;
    public Book(String title,String author,String ISBN)
    {
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
        this.isIssued=false;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public String getISBN()
    {
        return ISBN;
    }
    public boolean getIsIssued()
    {
        return isIssued;
    }
    public void setTitle()
    {
        this.title=title;
    }
    public void setAuthor()
    {
        this.author=author;
    }
    public void setISBN()
    {
        this.ISBN=ISBN;
    }
public void issueBook()
{
    if(!isIssued)
    {
        isIssued=true;
        System.out.println("the book "+title+" has been issued");
    }
    else
    {
        System.out.println("the book "+title+" has been issued already");
    }
}

}
