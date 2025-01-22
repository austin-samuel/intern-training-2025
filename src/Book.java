public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isIssued;

    public Book(String title, String author, String ISBN)
    {
        this.title=title;
        this.author= author;
        this.ISBN= ISBN;
        this.isIssued= false;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title=title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author=author;
    }

    public String getISBN()
    {
        return ISBN;
    }

    public void setISBN(String ISBN)
    {
        this.ISBN=ISBN;
    }

    public boolean isIssued()
    {
        return isIssued;
    }



    public void issueBook()
    {
        if(!isIssued)
        {
            isIssued= true;
            System.out.println("The book \""+title+"\" has been issued.");
        }
        else{
            System.out.println("Book is already issued.");
        }
    }

    @Override
    public String toString() {
        return "Book[Title=" + title + ", Author=" + author + ", ISBN=" + ISBN + ", Issued=" + isIssued + "]";
    }

}
