import java.util.Scanner;

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
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public String getISBN() {
        return ISBN;
    }
    public boolean getIssued() {
        return isIssued;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public void setAuthor(String author)
    {
        this.author=author;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void issueBook() {

        if (isIssued == false) {
            isIssued = true;
            System.out.print("The book " + title + " has been issued.");
        } else System.out.print("Sorry, The book " + title + " is already issued.");
    }

    public String toString() {
        return "The Book is named as "+this.getTitle()+" by author "+this.author+" with ISBN as "+this.ISBN;
    }

}
