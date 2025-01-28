package session3;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private Boolean isIssued;

    Book() {
        title = "";
        author = "";
        ISBN = "";
        isIssued = false;
    }

    Book(String title, String author, String ISBN, Boolean isIssued) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isIssued = isIssued;
    }

    String getTitle() {
        return title;
    }
    String getAuthor() {
        return author;
    }
    String getISBN() {
        return ISBN;
    }
    Boolean getIsIssued() {
        return isIssued;
    }

    void setTitle(String title) {
        this.title = title;
    }
    void setAuthor(String author) {
        this.author = author;
    }
    void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("The book \"" + title + "\" has been issued.");
        }
        else {
            System.out.println("Book doesn't exists, already issued.");
        }
    }

    @Override
    public String toString() {
        return "Title: " + title + ", author: " + author + ",  ISBN: " + ISBN + ", isIssued: " + isIssued;
    }
}
