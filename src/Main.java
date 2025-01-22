import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LibraryAdmin admin = new LibraryAdmin();
        List<Member> members = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. Add a member");
            System.out.println("4. Issue a book to a member");
            System.out.println("5. Display available books");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int c=scanner.nextInt();

            switch (c) {
                case 1:
                    System.out.println("Enter book title: ");
                    String title=scanner.next();
                    System.out.println("Enter book author: ");
                    String author = scanner.next();
                    System.out.print("Enter book ISBN: ");
                    String ISBN = scanner.next();
                    admin.addBook(new Book(title, author, ISBN));//adding to list
                    break;

                case 2:
                    System.out.print("Enter ISBN of the book to remove: ");
                    String removeISBN = scanner.next();
                    admin.removeBook(removeISBN);
                    break;

                case 3:
                    System.out.print("Enter member name: ");
                    String name = scanner.next();
                    System.out.print("Enter member email: ");
                    String email = scanner.next();
                    System.out.print("Enter member ID: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine();
                    members.add(new Member(name, email, memberId));
                    System.out.println("Member \"" + name + "\" has been added.");
                    break;

                case 4:
                    System.out.print("Enter member ID: ");
                    int id=scanner.nextInt();
                    Member member = null;
                    for (Member m : members) {
                        if (m.getMemberId() == id) {
                            member = m;
                            break;
                        }
                    }
                    if (member == null) {
                        System.out.println("Member not found.");
                        break;
                    }

                    System.out.print("Enter ISBN of the book to issue: ");
                    String issueISBN = scanner.next();
                    Book bookToIssue = null;
//                    for(Book book:admin.getBooks())
//                    {
//                        if(book.getISBN()==issueISBN)
//                    }
                    for (Book book:admin.getBooks()) {
                        if (book.getISBN().equals(issueISBN)) {
                            bookToIssue = book;
                            break;
                        }
                    }
                    if (bookToIssue == null) {
                        System.out.println("Book not found in the library.");
                    } else {
                        member.issueBook(bookToIssue);
                    }
                    break;

                case 5:
                    admin.DisplayAvailableBooks();
                    break;

                case 6:
                    System.out.println("you can exit");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    }
