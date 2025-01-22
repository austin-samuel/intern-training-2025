package model;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isIssued;

    // Constructor-1
    public Book() {
    }

    // Constructor-2
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Constructor-3
    public Book(String title, String author, String ISBN, boolean isIssued) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isIssued = isIssued;
    }

    // Getters and Setters for all attributes
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean getIsIssued() {
        return isIssued;
    }

    private void setIsIssued(boolean issued) {
        isIssued = issued;
    }

    void issueBook() {

        // Input book title
//        Scanner myObj = new Scanner(System.in);
//        System.out.print("Enter book title: ");
//        String title = myObj.nextLine();

        // Check book availability
        if(!this.getIsIssued()) {
            this.setIsIssued(true);
            System.out.println("The book "+this.getTitle()+" has been issued.");
        }
        else {
            System.out.println("The book is not available.");
        }
    }

    //we override toString() to display an object
    // in the desired/readable format
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", isIssued=" + isIssued +
                '}';
    }

}
