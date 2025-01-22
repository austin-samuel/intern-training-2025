public class Books {
    private String title;
    private String author;
    private String ISBN;
    private boolean isIssued;

    Books(String title, String author, String ISBN){
        this.title = title;
        this.author = author;

        this.ISBN = ISBN;
        this.isIssued = false;
    }

    void setTitle(String title){
        this.title = title;
    }
    void setAuthor(String author){
        this.author = author;
    }
    void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
//    void setIsIssued(Boolean isIssued){
//        this.isIssued = isIssued;
//    }

    String getTitle(){
        return this.title;
    }
    String getAuthor(){
        return this.author;
    }
    String getISBN(){
        return this.ISBN;
    }
    boolean getIsIssued(){
        return this.isIssued;
    }

    void issueBook(){
        if(isIssued){
            System.out.println("Already Issued");
        }
        isIssued = true;
        System.out.println("The book \""+this.getTitle()+"\" has been issued.");
    }

    public String toString(){
        return this.getTitle() + "," + this.getAuthor() + "," + this.getISBN();
    }
}
